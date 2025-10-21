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
	
	// capacity[10] = elemento 1, elemento 2, elemento 3... elemento 10;
	// size[9]: elements[0]= elemento 1... elements[9] = elemento 10;
	
	public boolean add(Object elem) {
		if (this.size < this.capacity) {
			this.elements[this.size] = elem;
			this.size ++;
			return true;
		}
		
		return false;
	}
	
	public void add(Object elem, int index) {
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		
		if (index >= 0 && index < capacity) {
			this.elements[index] = elem;
		}
	}
	
	public int size() {
		return this.size;
	}

	public Object getElem(int index) {
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		return this.elements[index];
	}
	
	public int exist(Object elem) {
		for (int i = 0; i < this.size; i++) {
			if (elem == this.elements[i]) {
				return i;
			}
		}
		return -1;
	}
	
//	public boolean exist(Object elem) {
//		for (int i = 0; i < this.size; i++) {
//			if (elem == this.elements[i]) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} return false;
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
