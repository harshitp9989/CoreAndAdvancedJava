package com.excelr.basics.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConstructorsExample {

	public static void main(String[] args) {
		Map<String, Integer> defaultHashMap = new HashMap<>();
		defaultHashMap.put("Aarav", 25);
		defaultHashMap.put("Aarohi", 30);
		System.out.println("HashMap using default constructor : "+ defaultHashMap);
		System.out.println(defaultHashMap.size());

		int initialCapacity = 20;
		Map<String, Integer> capacityHashMap = new HashMap<>(initialCapacity);
		capacityHashMap.put("Aishwarya", 20);
		System.out.println("HashMap using initial capacity constructor : "+ capacityHashMap);
		System.out.println(capacityHashMap.size());
		
		float loadFactor = 0.6f;
		Map<String, Integer> loadFactorHashMap = new HashMap<>(initialCapacity, loadFactor);
		loadFactorHashMap.put("Honey Singh", 28);
		System.out.println("HashMap using LoadFactor and Capacity"+ loadFactorHashMap);
		
		Map<String, Integer> existingMap = new HashMap<>();
		existingMap.put("Amrita", 22);
		existingMap.put("Sadan", 28);
		Map<String, Integer> copiedHashMap = new HashMap<>(existingMap);
		System.out.println("Hashmap using copy constructor : "+ copiedHashMap);
		
	}
}
