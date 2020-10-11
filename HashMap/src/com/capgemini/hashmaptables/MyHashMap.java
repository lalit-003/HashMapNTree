package com.capgemini.hashmaptables;

import java.util.HashMap;

public class MyHashMap<K,V>  {
	
	List_HeadNTail<K> linkedList;
	
	public MyHashMap()
	{
		linkedList = new List_HeadNTail<>();
	}

	public V get(K key) {
		// TODO Auto-generated method stub
		MyMapNode< K, V>  mapNode = (MyMapNode< K, V>) this.linkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	
	public void add(K key, V value) {
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.linkedList.search(key);
		if (mapNode == null) {
			mapNode = new MyMapNode<>(key, value);
			this.linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}

	}

	@Override
	public String toString() {
		return "MyHashmapNodes{" + linkedList + '}';
	}

}
