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
	
	private void printPreOrdem(NoBinario no) {
		if (no != null) {
			System.out.println(no.getElement());
			printPreOrdem(no.getLeft());
			printPreOrdem(no.getRight());
		}
	}
	
	private void printEmOrdem(NoBinario no) {
		if (no != null) {
			printEmOrdem(no.getLeft());
			System.out.println(no.getElement());
			printEmOrdem(no.getRight());
		}
	}
	
	private void printPosOrdem(NoBinario no) {
		if (no != null) {
			printPosOrdem(no.getLeft());
			printPosOrdem(no.getRight());
			System.out.println(no.getElement());
		}
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("Árvore vazia");
		} else {
			printPosOrdem(raiz);
		}
	}
	
	private NoBinario find(int valor, NoBinario no) {
		if (no == null) {
			return null;
		}
		
		else if (valor > no.getElement()) {
			return find(valor, no.getRight());
		} else if (valor < no.getElement()) {
			return find(valor, no.getLeft());
		} else {
			return no;
		}
	}
	
	public boolean find(int valor) {
		return find(valor,raiz) != null ? true:false; 
	}
	
	private NoBinario findMin(NoBinario no) {
		if (no == null) {
			return null;
		} else if (no.getLeft() == null) {
			return no;
		} return findMin(no);
	}
	
	public int findMin() throws EmptyTreeException {
		if (isEmpty()) {
			throw new EmptyTreeException();
		}
		return findMin(raiz).getElement();
	}
	
	private NoBinario findMax(NoBinario no) {
		if (no == null) {
			return null;
		} else if (no.getRight() == null) {
			return no;
		} return findMax(no.getRight());
	}
	
	public int findMax() throws EmptyTreeException {
		if (isEmpty()) {
			throw new EmptyTreeException();
		}
		return findMax(raiz).getElement();
	}
	
}
