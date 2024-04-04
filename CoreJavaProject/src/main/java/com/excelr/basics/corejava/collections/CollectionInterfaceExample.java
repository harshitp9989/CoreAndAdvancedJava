package com.excelr.basics.corejava.collections;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.hpsf.Array;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		
		System.out.println("Collection: "+ fruits);
		
		System.out.println("Is the collection empty?"+ fruits.isEmpty());
		
		System.out.println("Size: "+fruits.size());
		
		System.out.println("Contains Apple: "+ fruits.contains("Apple"));
		
		System.out.println("Contains Grapes: "+ fruits.contains("Grapes"));

		Collection<String> moreFruits = new ArrayList<>();
		moreFruits.add("Grapes");
		moreFruits.add("Orange");
		
		fruits.addAll(moreFruits);
		System.out.println("Collection after adding more elements: "+ fruits);
		
		fruits.remove("Banana");
		System.out.println("Collection after removing 'Banana:' "+ fruits);
		
		Collection<String> testFruits = new ArrayList<>(fruits);
		

		System.out.println("Collection testFruits: "+ testFruits);
		System.out.println("Collection moreFruits"+ moreFruits);
		testFruits.retainAll(moreFruits);
		System.out.println("Collection after retaining elements present in both: " + testFruits);
		
		testFruits.removeAll(moreFruits);
		System.out.println("Collection after removing elements not present in the other collection"+ testFruits);
		
		fruits.clear();
		System.out.println("Collection after clearing"+fruits);
	}
}
