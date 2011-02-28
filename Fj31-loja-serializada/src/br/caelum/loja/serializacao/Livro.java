package br.caelum.loja.serializacao;

import java.io.Serializable;

public class Livro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -519636361908363367L;
	private  String nome;
	private double preco;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	void setPreco(double preco) {
		this.preco = preco;
	}
	double getPreco() {
		return preco;
	}

}
