package br.com.caelum.loja.session;

import br.com.caelum.loja.entity.Livro;

public interface GerenciadorLoja {
	void salva(Livro livro);
	Livro procura(String isbn);
}
