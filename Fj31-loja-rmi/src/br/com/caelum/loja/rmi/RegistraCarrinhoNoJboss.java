package br.com.caelum.loja.rmi;



import javax.naming.InitialContext;

public class RegistraCarrinhoNoJboss {
public static void main(String[] args) throws Exception {
	
	
	
	InitialContext ctx = new InitialContext();
	ctx.rebind("carrinho", new CarrinhoBean());
	
	System.out.println("Carrinho registrado no JBOSS");
}
}
