package com.excelr.basics.corejava.collections.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapVsHashtableExample {
	
	public static void main(String[] args) {
		Map<String, Integer> hashMap1 = new HashMap<>();
		hashMap1.put("Harshit",25);
		hashMap1.put("Gowtham",27);
		hashMap1.put("Hanisha",23);
		hashMap1.put("Hanisha",null);

		for(Map.Entry<String, Integer> kk : hashMap1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}
		
		System.out.println();
		System.out.println();
		
		Hashtable<String, Integer> hashtable1 = new Hashtable<>();
		hashtable1.put("Alice", 25);
		hashtable1.put("Bob", 125);
		hashtable1.put("Mary", 225);
		hashtable1.put("Harry", 235);
		hashtable1.put("Tesla", 24);
		
		for(Map.Entry<String, Integer> kk : hashtable1.entrySet())
		{
			System.out.println(kk.getKey() + "-->"+kk.getValue());
		}

	}
}


////Parameters for comparison
//From where it is inheriting
//null elements
//thread safety
//order
 //time complexity