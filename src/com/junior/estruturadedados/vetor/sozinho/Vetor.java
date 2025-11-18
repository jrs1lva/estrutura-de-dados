package com.junior.estruturadedados.vetor.sozinho;

public class Vetor {
	private Object elements[];
	private int size;
	private int capacity;

	public Vetor(int capacity) {
		this.elements = new Object[capacity];
		this.size = 0;
		this.capacity = capacity;
	}

	public boolean add(Object elem) {
		this.maxCapacity();
		this.elements[this.size] = elem;
		this.size++;
		return true;
	}

	public boolean add(Object elem, int index) {
		if (!(this.verifiedPosition(index))) {
			throw new IllegalArgumentException("Invalid position!");
		}
		this.maxCapacity();

		for (int i = this.size - 1; i >= index; i--) {
			this.elements[i + 1] = this.elements[i];
		}

		this.elements[index] = elem;
		this.size++;

		return true;
	}

	public void maxCapacity() {
		if (this.size == this.capacity) {
			Object newElements[] = new Object[this.capacity * 2];
			for (int i = 0; i < this.capacity; i++) {
				newElements[i] = this.elements[i];
			}

			this.elements = newElements;
			this.capacity *= 2;
		}
	}

	public Object find(int index) {
		if (this.verifiedPosition(index)) {
			return this.elements[index];
		}
		throw new IllegalArgumentException("Invalid position!");
	}

	public int find(Object elem) {
		for (int i = 0; i < this.capacity; i++) {
			if (this.elements[i] == elem) {
				return i;
			}
		}
		return -1;
	}

	public boolean IsEmpty() {
		return (size == 0);
	}

	public boolean verifiedPosition(int index) {
		if (index >= 0 && index < this.size) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		String quebraLinha = System.lineSeparator();

		s.append("**Lista de Objetos**");
		s.append(quebraLinha);

		/* OU SIMPLESMENTE UTILIZAR \n */

		for (int i = 0; i < this.size; i++) {
			s.append(this.elements[i]);
			s.append(quebraLinha);
		}

//		if (this.size > 0) {
//			s.append(this.elements[this.capacity-1]);
//		}

		return s.toString();
	}

}
