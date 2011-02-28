package br.com.caelum.loja.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.CarrinhoFactory;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinho {

	/**
	 * @param args
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		CarrinhoFactory factory = (CarrinhoFactory) Naming.lookup("rmi://localhost:1099/loja/carrinhos");
		
		Carrinho carrinho = factory.create();
		
		System.out.println("A classe do carrinho "+carrinho.getClass());
		System.out.println("A classe do factory "+factory.getClass()); 
		
		Livro l1 = new Livro();
		l1.setNome("Tal Pai Tal Filho");
		l1.setPreco(125.99);
		
		Livro l2 = new Livro();
		l2.setNome("Pai e Filho Pobres");
		l2.setPreco(1);
		
		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		
		System.out.println(carrinho.getTotal());
	}

}
