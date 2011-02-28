package br.com.caelum.loja.teste;

import javax.persistence.EntityManager;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.jpa.JPAUtil;

public class TestaPersisteLivro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager man = new JPAUtil().createEntityManager();
		
		Livro livro = new Livro();
		livro.setNome("Uma biografia do fulano");
		livro.setPreco(120.0);
		
		man.getTransaction().begin();
		man.persist(livro);
		man.getTransaction().commit();
		
		System.out.println(livro.getId());
		
	}

}
