package com.excelr.basics.corejava.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable1 = new Hashtable<>();
		
		hashtable1.put("Alice", 25);
		hashtable1.put("Bob", 29);
		hashtable1.put("Charlie", 45);
		
		System.out.println("Hashtable Contents");
		for(Map.Entry<String, Integer> entry1 : hashtable1.entrySet() )
		{
			System.out.println(entry1.getKey()+ "-->" +entry1.getValue());
		}
	}
}
