package com.junior.estruturadedados.arvorebinaria.professor;

public class NoBinario {
	private int element;
	private NoBinario left;
	private NoBinario right;
	
	
	NoBinario(int e,NoBinario l,NoBinario r) {
	this.element=e;
	this.left=l;
	this.right=r;
	}
	
	
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public NoBinario getLeft() {
		return left;
	}
	public void setLeft(NoBinario left) {
		this.left = left;
	}
	public NoBinario getRight() {
		return right;
	}
	public void setRight(NoBinario right) {
		this.right = right;
	}
	
	
}

