package com.junior.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {
	private Object[] elements;
	private int size;
	private int capacity;
	
	public Vetor(int capacity) {
		this.elements = new Object[capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	
	public boolean add(Object elem) {
		if (this.size < this.capacity) {
			this.elements[this.size] = elem;
			this.size ++;
			return true;
		}
		
		return false;
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i < size-1; i++) {
			s.append(elements[i]);
			s.append(" | ");
		}
		
		if (this.size > 0) {
			s.append(this.elements[size-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
	
//	public void add(Object elem) throws Exception {
//		if (this.size < this.capacity) {
//			this.elements[this.size] = elem;
//			this.size ++;
//		} else {
//			throw new Exception("Limite de elementos atingido!");
//		}	
//	}
	
//	public void addBurro (Object elem) {
//		for (int i = 0; i < elements.length; i++) {
//			if (this.elements[i] == null) {
//				this.elements[i] = elem;
//				break;
//			}
//		}
//	}
}
