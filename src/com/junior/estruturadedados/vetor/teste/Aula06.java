package com.junior.estruturadedados.vetor.teste;

import com.junior.estruturadedados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.add(1.56);
		vetor.add(6);
		vetor.add("Noah");
		
		System.out.println(vetor.exist("Noah"));
		System.out.println(vetor.exist("elementos"));
	}

}
