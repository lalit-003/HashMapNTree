package com.capgemini.hashmaptables;

public class MyNode<K> implements InterfaceNode<K>{

	K key;
	private InterfaceNode<K> next;

 public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

//get method
	public InterfaceNode<K> getNext() {
		return  next;
	}

//set method
	public void setNext(InterfaceNode<K> next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}


    @Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

		





	@Override 
	public String toString()
	{
		StringBuilder nodeInString = new StringBuilder();
		nodeInString.append("My Node has  "+"key =").append(key);
		if(next != null){
			nodeInString.append("->").append(next);
			
		}
		
	return nodeInString.toString();	
	}
}