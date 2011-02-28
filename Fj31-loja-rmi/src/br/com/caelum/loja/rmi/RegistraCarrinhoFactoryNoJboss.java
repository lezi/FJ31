package br.com.caelum.loja.rmi;

import javax.naming.InitialContext;

public class RegistraCarrinhoFactoryNoJboss {
	public static void main(String[] args) throws Exception {
		InitialContext ctx = new InitialContext();
		ctx.rebind("carrinhos", new CarrinhoFactoryBean());
		System.out.println("Servico registrado no JBOSS");
	}
}
