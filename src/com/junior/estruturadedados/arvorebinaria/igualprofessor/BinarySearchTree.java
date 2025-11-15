package com.junior.estruturadedados.arvorebinaria.igualprofessor;

public class BinarySearchTree {
	private BinaryNode root;

	class BinaryNode {
		private int element;
		private BinaryNode left;
		private BinaryNode right;
		private int count;
		
		BinaryNode(int e, BinaryNode l, BinaryNode r) {
			element = e;
			left = l;
			right = r;
			count = 1;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public void clear() {
		root = null;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public void insert(int x) {
		root = insert(x, root);
	}

	private BinaryNode insert(int x, BinaryNode t) {
		if (t == null)
			t = new BinaryNode(x, null, null);
		else if (x < t.element)
			t.left = insert(x, t.left);
		else if (x > t.element)
			t.right = insert(x, t.right);
		else {
			t.count++;
		}
		
		return t;
	}

	public void print() {
		if (isEmpty())
			System.out.println("Arvore Vazia");
		else
			print(root);
	}

	private void print(BinaryNode t) {
		// percorre a árvore em ordem
		if (t != null) {
			print(t.left);
			System.out.println(t.element + " (" + t.count + ")");
			print(t.right);
		}
	}

	public boolean find(int x) {
		return find(x, root) != null ? true : false;
	}

	private BinaryNode find(int x, BinaryNode t) {
		if (t == null)
			return null; // elemento não está na árvore
		if (x < t.element)
			return find(x, t.left);
		else if (x > t.element)
			return find(x, t.right);
		else
			return t; // encontrou
	}

	public int findMin() {
		if (isEmpty())
			throw new EmptyTreeException("Empty Tree");
		return findMin(root).element;
	}

	private BinaryNode findMin(BinaryNode t) {
		if (t == null)
			return null;
		else if (t.left == null)
			return t;
		return findMin(t.left);
	}

	public int findMax() {
		if (isEmpty())
			throw new EmptyTreeException("Empty Tree");
		return findMax(root).element;

	}

	private BinaryNode findMax(BinaryNode t) {
		if (t != null)
			while (t.right != null)
				t = t.right;
		return t;
	}

	public void remove(int x) {
		root = remove(x, root);
	}

	private BinaryNode remove(int x, BinaryNode t) {
		if (t == null)
			return t; // Item não está na árvore ou árvore vazia, não faça nada
		if (x < t.element)
			t.left = remove(x, t.left);
		else if (x > t.element)
			t.right = remove(x, t.right);
		
		else if (t.left != null && t.right != null) { // Caso 3 – nó com dois filhos
			if (t.count >= 2) {
				t.count--;
			} else {
				t.element = findMin(t.right).element;
				t.right = remove(t.element, t.right);
			}
			
		} else {// Caso 1 e 2 – nó com um ou nenhum filho
			if (t.count >= 2) {
				t.count--;
			} else {
				t = (t.left != null) ? t.left : t.right;
			}		
		}
		return t;
	}

}
