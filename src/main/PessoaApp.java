package main;

import entity.Pessoa;

public class PessoaApp {

	public static void main(String[] args) {

		Pessoa hilton = new Pessoa(10L, "Hilton");
		Pessoa amanda = new Pessoa(15L, "Amanda", hilton);
		hilton.setConjuge(amanda);
		
		System.out.println(hilton + ". Conjuge: " + hilton.getConjuge().getNome());
		
	}

}
