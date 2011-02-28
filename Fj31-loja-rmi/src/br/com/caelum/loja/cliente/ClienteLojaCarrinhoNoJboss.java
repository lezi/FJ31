package br.com.caelum.loja.cliente;

import javax.naming.InitialContext;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.CarrinhoFactory;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinhoNoJboss {
	public static void main(String[] args) throws Exception {

		InitialContext ctx = new InitialContext();
		
		Carrinho carrinho = (Carrinho) ctx.lookup("carrinho");

		System.out.println("A classe do carrinho " + carrinho.getClass());
		

		Livro l1 = new Livro();
		l1.setNome("Tal Pai Tal Filho 2");
		l1.setPreco(115.99);

		Livro l2 = new Livro();
		l2.setNome("Pai e Filho Pobres");
		l2.setPreco(1);

		carrinho.addLivro(l1);
		carrinho.addLivro(l2);

		System.out.println(carrinho.getTotal());
	}
}
