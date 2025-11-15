package com.junior.estruturadedados.arvorebinaria.igualprofessor;

public class ArvoreApp {

	public static void main(String[] args) {
		BinarySearchTree minhaABB = new BinarySearchTree();

		minhaABB.insert(6);
		minhaABB.insert(8);
		minhaABB.insert(6);
		minhaABB.insert(4);
		minhaABB.insert(4);
		minhaABB.print();

		System.out.println("Após a remoção");
		minhaABB.remove(2);
		minhaABB.remove(4);
		minhaABB.print();
	}
}
