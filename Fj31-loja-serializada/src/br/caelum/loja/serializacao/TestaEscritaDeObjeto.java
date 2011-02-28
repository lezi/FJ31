package br.caelum.loja.serializacao;

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestaEscritaDeObjeto {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("livros.txt"));
		Livro l1 = new Livro();		
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);
		
		Livro l2 = new Livro();		
		l2.setNome("Pais e Filhos Todos Pobres");
		l2.setPreco(1.0);
		
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		
		ous.writeObject(livros);
		ous.close();
		
		

	}

}
