package br.com.caelum.loja.teste;

import javax.persistence.EntityManager;

import br.com.caelum.loja.jpa.JPAUtil;

public class TestaCriacaoDeTabelas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager manager  = new  JPAUtil().createEntityManager();
		
		manager.close();
		System.out.println("funcionou");
	}

}
