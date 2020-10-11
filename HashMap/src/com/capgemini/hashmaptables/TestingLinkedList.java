package com.capgemini.hashmaptables
;

import org.junit.Assert;
import org.junit.Test;

public class TestingLinkedList<E> {

	// UC1 adding three integers//
	// test 1
	@Test
	public void addingThreeNumbers_ShouldPassSimpleAdditionTest() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

		boolean testCheck = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);

		Assert.assertTrue(testCheck);

	}

//
	// test 2
	// adding new element before head
	@Test
	public void Given3Numbers_AddedToTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.add(secondNode);
		Obj1.add(thirdNode);

		// System.out.println(firstNode);

		boolean result = Obj1.head.equals(thirdNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(firstNode);
		Assert.assertTrue(result);

	}

	// test 3
	// adding new element after tail
	@Test
	public void Given3Numbers_AddedAtTail() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);

		// System.out.println(firstNode);

		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);

	}

	// test 4
	// inserting 70 between 56 and 30
	@Test
	public void Given3Numbers_AddedInBetween() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(thirdNode);
		Obj1.insertAfter(firstNode, secondNode);

		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);

	}

	// test 5
	// deleting element at head
	@Test
	public void pop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
		MyNode<Integer> deletedElement = Obj1.pop();

		// System.out.println("Deleted Element is " + deletedElement +" is successfully
		// deleted");

		boolean result = Obj1.head.equals(secondNode) && Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);

	}

	// test 6
	// deleting element at tail
	@Test
	public void lastPop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
		MyNode<Integer> deletedElement = Obj1.lastPop();

		// System.out.println("Deleted Element is " + deletedElement +" & successfully
		// deleted");

		boolean result = Obj1.head.equals(firstNode) && Obj1.tail.equals(secondNode);
		Assert.assertTrue(result);

	}

	// test 7
	// searching an element by passing an object
	@Test
	public void SearchElement() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
		boolean result = Obj1.search(thirdNode);

		Assert.assertTrue(result);

	}

	// test 8
	// adding 40 after 30
	@Test
	public void AddingFourthNumberInBetween() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);

		Obj1.insertAfter(secondNode, fourthNode);

		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.head.getNext().getNext().equals(fourthNode) && Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);

	}

	// test 9
	// deleting an element by key
	@Test
	public void DeletingAnElementFromListByKey() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
		Obj1.append(fourthNode);

		int deleted = (int) Obj1.delete(40);
		// int deleted = (int) Obj1.delete(60);

		boolean result = (deleted == 40);

		Assert.assertTrue(result);
	}
	
//	// test 9
//		// sorting elements by key
//		@Test
//		public void SortingElementsInListByKey() {
//			MyNode<Integer> firstNode = new MyNode<Integer>(56);
//			MyNode<Integer> secondNode = new MyNode<Integer>(30);
//			MyNode<Integer> thirdNode = new MyNode<Integer>(40);
//			MyNode<Integer> fourthNode = new MyNode<Integer>(70);
//
//			List_HeadNTail Obj1 = new List_HeadNTail();
//			Obj1.add(firstNode);
//			Obj1.append(secondNode);
//			Obj1.append(thirdNode);
//			Obj1.append(fourthNode);
//
//			Obj1.sort();
//			
//			boolean result = Obj1.head.equals(secondNode) && Obj1.head.getNext().equals(thirdNode)
//					&& Obj1.head.getNext().getNext().equals(firstNode) && Obj1.tail.equals(fourthNode);
//			Assert.assertTrue(result);
//
//			
//		}


}