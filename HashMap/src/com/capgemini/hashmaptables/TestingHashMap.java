package com.capgemini.hashmaptables;

import org.junit.Assert;
import org.junit.Test;


public class TestingHashMap<E> {

	
	@Test
	public void WhenAddedAnSentence_ToList_ShouldReturnFrequency()
	{
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word :words)
		{
			Integer value = hashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("be");
		System.out.println(hashMap);
		Assert.assertEquals(2, frequency);
	}
}