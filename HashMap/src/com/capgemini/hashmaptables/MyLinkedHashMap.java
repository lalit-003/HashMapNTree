package com.capgemini.hashmaptables;

import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable<K>,V extends Comparable<V>> {

	private final int numberOfBuckets;
	ArrayList<List_HeadNTail<K>> myBucketArray;


	public MyLinkedHashMap() {
		this.numberOfBuckets = 10;
		this.myBucketArray = new ArrayList<>(numberOfBuckets);
		for (int i = 0; i < numberOfBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}
// to find index for specific key
	private int getBucketIndex(K key) {
		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numberOfBuckets;
		System.out.println("Key: "+key+" hashCode: "+hashcode+" index: "+index);
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		List_HeadNTail<K> myList_HeadNTail = this.myBucketArray.get(index);
		if(myList_HeadNTail == null) return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myList_HeadNTail.search( key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	
	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		List_HeadNTail<K> myList_HeadNTail = this.myBucketArray.get(index);
		if(myList_HeadNTail == null) {
			myList_HeadNTail = new List_HeadNTail<>();
			this.myBucketArray.set(index, myList_HeadNTail);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myList_HeadNTail.search( key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myList_HeadNTail.append( myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyLinkedHashMap [myBucketArray=" + myBucketArray + "]";
	}
}