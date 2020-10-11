package com.capgemini.hashmaptables;

public class MyMapNode<K, V> implements InterfaceNode<K> {

	K key;
	V value;

	MyMapNode<K, V> next;

	public MyMapNode(K key , V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
		this.next = null;
	}
@Override
	public K getKey() {
		return key;
	}
@Override
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	@Override
	public InterfaceNode<K> getNext() {
		return next;
	}
	@Override
	public void setNext(InterfaceNode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append("V=").append(value).append('}');
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}

}
