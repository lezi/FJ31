package br.caelum.loja.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestaLeituraDeObjeto {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("livros.txt"));
		
	   List<Livro> livros = (List<Livro>) ois.readObject();
	   
	   for(Livro l:livros){
		   System.out.println(l.getNome());
		   System.out.println(l.getPreco());
		   System.out.println("--------------------------------");
	   }

	}

}
