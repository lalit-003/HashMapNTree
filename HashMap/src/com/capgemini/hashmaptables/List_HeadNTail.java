package com.capgemini.hashmaptables;

public class List_HeadNTail<K> {

	public MyNode<K> head;
	public MyNode<K> tail;

	public List_HeadNTail() {
		this.head = null;
		this.tail = null;
	}

	public void add(MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			MyNode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}
	public void append(MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}

	}
	
	
	// inserting between node1 and node next to node1 
	public void insertAfter(MyNode<K> node1,MyNode<K> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = node1;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			MyNode<K> tempNode = node1.getNext() ;
			node1.setNext(newNode);
			newNode.setNext(tempNode);


		}
	}
	//
	//delete first element/node and deleted element
	public MyNode<K>  pop() {
		// TODO Auto-generated method stub

		MyNode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

		}
	

public MyNode<K>  lastPop() {
	// TODO Auto-generated method stub

	
	MyNode<K> tempNode = (MyNode<K>) this.head;
	while(!tempNode.getNext().equals(tail))
	{
		tempNode = tempNode.getNext();
	}
	this.tail = tempNode;
	tempNode = tempNode.getNext();
	return tempNode;

	}

public boolean  search(MyNode<K> searchElement) {
	// TODO Auto-generated method stub

	

	boolean flag =false;
	int position =0;
	
	MyNode<K> tempNode = this.head;
	while(true)
	{
		
		position++;
		if(tempNode.equals(searchElement))
		{
			flag = true;
			System.out.println("element found at position : "+position+"  and value is  : "+tempNode.key);

			break;
			
		}
		tempNode = tempNode.getNext();

	}
		return flag;

	}

public K delete(K key)
{
	K deletedElement = null ;
	MyNode<K> prev = null;
	MyNode<K> currentNode = head;
	K searchKey = key;
	
	if(currentNode != null && currentNode.key == searchKey )
	{
		this.head = currentNode.getNext();
				
	}
	
	while(currentNode != null && currentNode.key != searchKey )
	{
		prev = currentNode;
		currentNode = currentNode.getNext();
		
	}
	
	
	if (currentNode != null) {
		deletedElement = currentNode.key;
		MyNode<K> Next = currentNode.getNext();
		 prev.setNext(Next);
		System.out.println(deletedElement + "  : found and deleted");
	}
	
	if(currentNode == null)
	{
		System.out.println(searchKey + "  : not found");

	}
	
	MyNode<K> node = head;
	System.out.println("keys after deletion are :");

	int size=0;
	while(node != null)
	{
		System.out.println(node.key);
		node = node.getNext();
            size++;
	}
	System.out.println("final size is :" +size);
	return deletedElement;
}


//public <K extends Comparable <K>> void sort()
//{
//	
//   MyNode<K> currentElement = (MyNode<K>) head;
//  
//   MyNode<K> tempElement = currentElement;
//   int size =4;
//   int k=0;
//   
//   
//	   MyNode<K> currentElement1 = currentElement;
//	   
//	   MyNode<K> nextElement =  currentElement.getNext();
//	   for (int i=k;i<size;i++)
//	   {
//	   System.out.println("entered while loop");
//	   if((currentElement.key).compareTo(nextElement.key) > 0)
//	   {
////		   K Key = currentElement.key;
////		   currentElement.setKey(nextElement.key);
////		   nextElement.setKey(Key);
//		tempElement = currentElement;
//		 currentElement = nextElement;
//		  currentElement.setNext(tempElement);
//		  System.out.println("elements keys are :"+currentElement.key+"  "+nextElement.key); 
//	   }
//	   
//	   nextElement = nextElement.getNext();
//	   System.out.println("elements keys are :"+nextElement.key); 
//	   
//	   }
//	   k++;
//	   currentElement =currentElement1.getNext();
//   
//   
//     MyNode<K> node =  (MyNode<K>) head;
//	System.out.println("keys after sorting are :");
//
//	while(node != null)
//	{
//		System.out.println(node.key);
//		node = node.getNext();
//	}
//
//   
//}

}




	
	





