package br.com.caelum.loja.teste;

import javax.persistence.EntityManager;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.jpa.JPAUtil;

public class TestaCarregamentoReference {
	public static void main(String[] args) {
		EntityManager man = new JPAUtil().createEntityManager();

		Livro livro = man.getReference(Livro.class, 1L);
		System.out.println("reference feito");
		/*
		 * gera illegalStateException
		 */
	//	man.getTransaction().commit();  
		System.out.println(livro.getId());
		System.out.println(livro.getNome());
		System.out.println(livro.getPreco());

	}
}
