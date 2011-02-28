package br.com.caelum.loja.client.gerenciado;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteGerenciador {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();
		
		GerenciadorLoja gerenciador = (GerenciadorLoja)ctx.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");
		
		Livro livro = new Livro();
		livro.setNome("Pais e Filhos G3");
		livro.setPreco(1.99);
		
		gerenciador.salva(livro);
		System.out.println("Salvei do gerenciador!!");

	}

}
