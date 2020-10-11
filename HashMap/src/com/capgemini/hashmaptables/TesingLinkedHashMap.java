package com.capgemini.hashmaptables;

import org.junit.Test;

public class TesingLinkedHashMap {

	
	
	@Test
	public void WhenAddedAnSentence_ToList_ShouldReturnWordFrequency_UsingHashFunctionAndHashTable()
	{
		String sentence1 = "Paranoids are not paranoid because they are paranoid but because they keep putting"
				           + " themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();

		String words1[] = sentence1.toLowerCase().split(" ");
		for (String word : words1) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}

		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println("Frequency is : "+frequency);

	}

}
