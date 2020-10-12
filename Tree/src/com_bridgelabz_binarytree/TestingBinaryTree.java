package com_bridgelabz_binarytree;

import org.junit.Assert;
import org.junit.Test;


public class TestingBinaryTree {

	@Test
	public void addedThreeNumbers_ShouldReturnSizeAs3()
	{
	MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
	   binaryTree.add(56);
	   binaryTree.add(30);
	   binaryTree.add(70);
	   System.out.println("Size is :");
	   int size = binaryTree.getSize();
	   System.out.println("Size is :"+ size);
	   Assert.assertEquals(3, size);

	   
	   
	}
}