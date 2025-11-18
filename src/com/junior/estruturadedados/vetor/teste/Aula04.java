package com.junior.estruturadedados.vetor.teste;

import com.junior.estruturadedados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.add(1.56);
		vetor.add(3);
		vetor.add("Noah");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
		
	}
}
