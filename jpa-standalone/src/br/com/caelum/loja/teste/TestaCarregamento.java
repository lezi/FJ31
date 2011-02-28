package br.com.caelum.loja.teste;

import javax.persistence.EntityManager;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.jpa.JPAUtil;

public class TestaCarregamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager man = new JPAUtil().createEntityManager();

		Livro livro = man.find(Livro.class, 2L);
		System.out.println("Select feito");
		System.out.println(livro.getId());
		System.out.println(livro.getNome());
		System.out.println(livro.getPreco());

	}

}
