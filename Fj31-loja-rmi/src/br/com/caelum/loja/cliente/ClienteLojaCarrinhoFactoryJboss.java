package br.com.caelum.loja.cliente;

import javax.naming.InitialContext;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.CarrinhoFactory;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinhoFactoryJboss {
	public static void main(String[] args) throws Exception {
		InitialContext ctx = new InitialContext();
		CarrinhoFactory factory = (CarrinhoFactory) ctx.lookup("carrinhos");

		Carrinho carrinho = factory.create();

		System.out.println("A classe do carrinho " + carrinho.getClass());
		System.out.println("A classe do factory " + factory.getClass());

		Livro l1 = new Livro();
		l1.setNome("Tal Pai Tal Filho 3");
		l1.setPreco(99.99);

		Livro l2 = new Livro();
		l2.setNome("Pai e Filho Pobres");
		l2.setPreco(1);

		carrinho.addLivro(l1);
		carrinho.addLivro(l2);

		System.out.println(carrinho.getTotal());
	}
}
