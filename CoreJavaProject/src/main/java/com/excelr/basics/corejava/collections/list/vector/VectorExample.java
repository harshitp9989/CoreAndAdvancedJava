package com.excelr.basics.corejava.collections.list.vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add(null);
		fruits.add("Cherry");

		System.out.println("Vector: " + fruits);

		System.out.println("Element at index0: " + fruits.get(0));
		System.out.println("Element at index0: " + fruits.get(1));
		System.out.println("Element at index0: " + fruits.get(2));

		System.out.println("Size of vector: " + fruits.size());

		fruits.remove(1);
		System.out.println("After removing an element, size: " + fruits.size());

		System.out.println("Bananas present? :" + fruits.contains("Banana"));
		System.out.println("Grapes present? :" + fruits.contains("Grapes"));

		System.out.println("Elements in the vector");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		fruits.clear();
		System.out.println("After clearing, size:" + fruits.size());

	}
}
