package com.capgemini.hashmaptables;

public interface InterfaceNode<K> {

	public K getKey();

	public InterfaceNode<K> getNext();

	public void setNext(InterfaceNode<K> next);

	public void setKey(K key);

}
