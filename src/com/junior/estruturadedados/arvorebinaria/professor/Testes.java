package com.junior.estruturadedados.arvorebinaria.professor;

public class Testes {

	public static void main(String[] args) {
		ArvoreBuscaBinaria arvore = new ArvoreBuscaBinaria();
		arvore.insert(8);
		arvore.insert(4);
		arvore.insert(15);
		arvore.insert(3);
		arvore.insert(6);
		arvore.insert(12);
		arvore.insert(16);
		arvore.insert(5);
		arvore.insert(7);
		arvore.insert(10);
		arvore.insert(14);
		arvore.insert(9);
		arvore.insert(11);
	
		arvore.print();
	}

}
