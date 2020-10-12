package com_bridgelabz_binarytree;

import org.junit.Assert;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		// TODO Auto-generated method stub
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		// TODO Auto-generated method stub
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public static void main(String[] args)
	{
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		   binaryTree.add(56);
		   binaryTree.add(30);
		   binaryTree.add(70);
		   int size = binaryTree.getSize();
		   System.out.println("Size is :"+ size);
		   Assert.assertEquals(3, size);

	}
}
