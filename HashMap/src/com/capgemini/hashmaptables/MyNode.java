package com.capgemini.hashmaptables;

public class MyNode<K> {

	K key;
	private MyNode<K> next;

 public MyNode(K key) {
		this.key = null;
		this.next = next;
	}

//get method
	public MyNode<K> getNext() {
		return  next;
	}

//set method
	public void setNext(MyNode<K> next) {
		this.next = next;
	}

	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}


	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}





//	@Override 
//	public String toString()
//	{
//		StringBuilder nodeInString = new StringBuilder();
//		nodeInString.append("My Node has  "+"key =").append(key);
//		if(next != null){
//			nodeInString.append("->").append(next);
//			
//		}
//		
//	return nodeInString.toString();	
//	}
}