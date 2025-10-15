package arrays;

public class Vetor {
//mudei aqui
	private Object list[];
	private int capacity;
	private int size;

	public Vetor(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.list = new Object[capacity];
	}
	
	public Vetor() {
		this.capacity = 5;
		this.size = 0;
		this.list = new Object[capacity];
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void print() {
		if (size == 0) {
			System.out.println("<---Lista Vazia--->");
		} else {
			System.out.println("<---Inicio--->");
			for (int i = 0; i < size; i++) {
				System.out.println(list[i]);
			}
			System.out.println("<----Fim----->");
		}
	}

	public boolean add(Object element) {
		aumentarArray();
		list[size] = element;
		size++;
		return true;
	}

	public void add(int index, Object element) {
		aumentarArray();
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index inválido, " + index);
		}
		for (int i = size + 1; i > index; i--) {
			list[size] = list[i - 1];
		}
		list[index] = element;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	public Object get(int index) {
		return list[index];
	}

	public int indexOf(Object element) {
		for (int i = 0; i < size; i++) {
			if (list[i].equals(element))
				return i;
		}
		return -1;
	}

	public boolean remove(Object element) {
		for (int i = 0; i < size; i++) {
			if (list[i].equals(element)) {
				for (int j = i; j < size; j++) {
					list[j] = list[j + 1];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index fora dos limites, " + index);
		}
		Object removedElement = list[index];
		list[index] = null;
		for (int j = index; j < size; j++) {
			list[j] = list[j + 1];
		}
		size--;
		return removedElement;
	}

	public Object set(int index, Object element) {
		return null;
	}

	public void aumentarArray() {
		if (size == capacity) {
			Object[] newList = new Object[capacity *= 2];
			for (int i = 0; i < size; i++) {
				newList[i] = list[i];
			}
			list = newList;
		}
	}

	public void trimToSize() {
		Object[] cutList = new Object[size];
		for (int i = 0; i < size; i++) {
			cutList[i] = list[i];
		}
		list = cutList;
		capacity = size;
	}
}