package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double total;
	private Integer teste;
	private List<Livro> livros = new ArrayList<Livro>();
	
	
	protected CarrinhoBean() throws RemoteException {
		super();
	}

	@Override
	public void addLivro(Livro livro) throws RemoteException {
		
		livros.add(livro);
		total += livro.getPreco(); 
		
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}

}
