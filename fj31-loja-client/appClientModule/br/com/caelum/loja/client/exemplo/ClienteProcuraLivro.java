package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteProcuraLivro {
	public static void main(String[] args) throws NamingException{
		InitialContext ctx = new InitialContext();
		
		GerenciadorLoja gerenciador = (GerenciadorLoja) ctx.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");
		
		Livro livro = gerenciador.procura("2222");
		
		System.out.println(livro.getNome());
	}
}
