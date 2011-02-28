package br.com.caelum.livraria.cliente;

import javax.naming.InitialContext;

import br.com.caelum.livraria.ejb.Carrinho;
import br.com.caelum.livraria.modelo.Livro;

public class ClienteCarrinhoLivraria {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		InitialContext ctx = new InitialContext();
		Carrinho carrinho = (Carrinho)ctx.lookup("CarrinhoBean/remote");
		
		Livro livro = new Livro();
		livro.setNome("A busca pelo infinito");
		livro.setPreco(1500.00);
		
		carrinho.addLivro(livro);
		
		System.out.println("Total da compra: "+carrinho.getTotal());
		
		carrinho.finalizaCompra();
	}

}
