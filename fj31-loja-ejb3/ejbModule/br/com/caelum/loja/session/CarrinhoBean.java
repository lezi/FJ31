package br.com.caelum.loja.session;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import br.com.caelum.loja.entity.Livro;

@Stateful
@Remote(Carrinho.class)
//@Pool(value="StrictMaxPool", maxSize=1)
public class CarrinhoBean implements Carrinho {

	@EJB
	private Mensageiro mensageiro;
	
	
	private double total;
	private List<Livro> livros = new ArrayList<Livro>();

	@Override
	public void addLivro(Livro livro) {
		this.livros.add(livro);
		this.total += livro.getPreco();
		
		System.out.printf("Livro %s adicionado com sucesso\n", livro.getNome());
	}

	@Override
	public List<Livro> getLivros() {
		return this.livros;
	}

	@Override
	public double getTotal() {
		return this.total;
	}

	@Override
	@Remove
	public void finalizaCompra() {
		for (Livro livro : this.livros) {
			System.out.println("Comprando livro: " + livro.getNome());
		}
		this.mensageiro.enviaMensagem("MSG: "+this.livros.toString());
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Removendo uma instância da Classe CarrinhoBean");
	}
	
}
