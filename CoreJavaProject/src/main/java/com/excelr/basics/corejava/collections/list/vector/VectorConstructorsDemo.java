package com.excelr.basics.corejava.collections.list.vector;

import java.util.Vector;

public class VectorConstructorsDemo {

	public static void main(String[] args) {
		Vector<String> defaultVector = new Vector<>();
	
		defaultVector.add("Apple");
		defaultVector.add("Banana");
		defaultVector.add("Apple");
		defaultVector.add(null);
		defaultVector.add("Orange");


		Vector<Integer> capacityVector = new Vector<>(5);
		capacityVector.add(10);
		capacityVector.add(20);
		capacityVector.add(30);

		
		Vector<Double> capacityAndIncrementVector = new Vector<>(3,2);
		capacityAndIncrementVector.add(1.2);
		capacityAndIncrementVector.add(2.5);
		capacityAndIncrementVector.add(3.2);
		capacityAndIncrementVector.add(3.2);

		
		Vector<String> existingVector = new Vector<>(defaultVector);
		existingVector.add("Cherry");
		
		System.out.println("Default vector: "+ defaultVector);
		System.out.println(defaultVector.size());
		
		System.out.println("Capacity vector: "+ capacityVector);
		System.out.println(capacityVector.size());

		System.out.println("capacityAndIncrementVector: "+ capacityAndIncrementVector);
		System.out.println(capacityAndIncrementVector.size());

		System.out.println("Existing vector: "+ existingVector);
		System.out.println(existingVector.size());

	}
}
