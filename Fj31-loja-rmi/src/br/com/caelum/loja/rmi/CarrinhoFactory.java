package br.com.caelum.loja.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarrinhoFactory extends Remote {
	Carrinho create() throws RemoteException;
}
