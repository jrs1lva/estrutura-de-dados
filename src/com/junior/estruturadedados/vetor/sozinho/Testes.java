package com.junior.estruturadedados.vetor.sozinho;

public class Testes {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		vetor.add("Elemento 1");
		vetor.add("Elemento 2");
		vetor.add("Elemento 3");
		vetor.add("Elemento 4");
		vetor.add("Elemento 5");
		
		System.out.println(vetor);
		
		vetor.add("Elemento 7", 3);
		System.out.println(vetor);
		
	}

}

