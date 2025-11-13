package com.junior.estruturadedados.arvorebinaria.professor;

public class ArvoreBuscaBinaria {
	private NoBinario raiz;
	
	public ArvoreBuscaBinaria() {
		raiz = null;
	}
	
	public void clear() {
		raiz = null;
	}
	
	public boolean isEmpty() {
		return (raiz == null);
	}
	
	private NoBinario insertRecursivo(int valor, NoBinario no) {
		if (no == null) {
			no = new NoBinario(valor, null, null);
		} else if (valor < no.getElement()) {
			no.setLeft(insertRecursivo(valor, no.getLeft()));
		} else if (valor > no.getElement()) {
			no.setRight(insertRecursivo(valor, no.getRight()));
		}
		
		return no;
	}
	
	public void insert(int valor) {
		raiz = insertRecursivo(valor, raiz);
	}
	
}
