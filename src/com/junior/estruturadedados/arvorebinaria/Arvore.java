package com.junior.estruturadedados.arvorebinaria;

public class Arvore {
	private Folha folha;
	private Arvore direita;
	private Arvore esquerda;
	
	public Arvore() {
		this.direita = null;
		this.esquerda = null;
		this.folha = null;
	}
	
	public Arvore(Folha folha) {
		this.folha = folha;
		this.direita = null;
		this.esquerda = null;
	}
	
	public boolean isEmpty() {
		return this.folha == null;
	}
	
	public void inserir(Folha nova) {
		if (isEmpty()) {
			this.folha = nova;
		} else {
			Arvore novaArvore = new Arvore(nova);
			if (nova.getValor() > this.folha.getValor())  {
				if (this.direita == null) {
					this.direita = novaArvore;
					System.out.println("Folha " + nova.getValor() + " à direita de " + this.folha.getValor());
				} else {
					this.direita.inserir(nova);
				}
			} else if (nova.getValor() < this.folha.getValor()) {
				if (this.esquerda == null) {
					this.esquerda = novaArvore;
					System.out.println("Folha " + nova.getValor() + " à esquerda de " + this.folha.getValor());
				} else {
					this.esquerda.inserir(nova);
				}
			}
		}
	}
	
	
}

