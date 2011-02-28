package br.com.caelum.loja.listeners;

import javax.persistence.PrePersist;

public class LivroListener {
	
	@PrePersist
	public void preAltera(Object ob) {
		System.out
				.println("CALLBACK preAltera()-Novo Livro "+ob.toString());
		
	}
}
