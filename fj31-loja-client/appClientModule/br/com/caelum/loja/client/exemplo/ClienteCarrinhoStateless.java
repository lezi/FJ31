package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.Carrinho;

public class ClienteCarrinhoStateless {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		InitialContext ic = new InitialContext();
		Carrinho carrinho = (Carrinho) ic
				.lookup("fj31-loja-ear/CarrinhoBean/remote");

		Livro l1 = new Livro();
		l1.setNome("Fausto 7");
		l1.setPreco(150);

		carrinho.addLivro(l1);
		
		for(Livro l:carrinho.getLivros()){
			System.out.println(l.getNome());
		}


	}

}
