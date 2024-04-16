package com.excelr.basics.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashingExample {

	public static void main(String[] args) {
		Map<String, Integer> hashMap1 = new HashMap<>();
		
		hashMap1.put("Alice in the wonderLand", 25);
		hashMap1.put("Alice in the India", 255);
		hashMap1.put("Alice in the USA", 335);

		int wonderHashCode = "Alice in the wonderLand".hashCode();
		int indiaHashCode = "Alice in the India".hashCode();
		int usaHashCode = "Alice in the USA".hashCode();

		for (String key : hashMap1.keySet()) 
		{
            int hashCode = key.hashCode();
            System.out.println("Hash code of key '" + key + "': " + hashCode);
        }
		
		System.out.println("wonderHashCode : "+ wonderHashCode);
		System.out.println("indiaHashCode : "+ indiaHashCode);
		System.out.println("usaHashCode : "+ usaHashCode);
		
		int pin = hashMap1.get("Alice in the USA");
		System.out.println("Alice's pincode in USA " + pin);
 	}
}
