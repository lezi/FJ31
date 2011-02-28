package br.com.caelum.loja.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RegistraCarrinhoFactoryNoServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		LocateRegistry.createRegistry(1099);
		Naming.rebind("loja/carrinhos", new CarrinhoFactoryBean());
		System.out.println("Servico registrado");
	}

}
