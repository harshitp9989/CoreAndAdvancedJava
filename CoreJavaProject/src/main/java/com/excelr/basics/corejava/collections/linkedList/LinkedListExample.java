package com.excelr.basics.corejava.collections.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		
		names.add("Bob");
		names.add("Om");
		names.add(null);
		names.add("John");

		
		System.out.println("Element1"+names.get(0));
		System.out.println("Element2"+names.get(1));
		System.out.println("Element3"+names.get(2));
		System.out.println("Element4"+names.get(3));

		System.out.println("Size of LinkedList" + names.size());
		
		names.remove(1);
		System.out.println("Size of LinkedList after removing" + names.size());


		System.out.println("Contains Bob?" + names.contains("Bob"));
		System.out.println("Contains John?" + names.contains("John"));
		System.out.println("Contains kuru?" + names.contains("Kuru"));

		names.add(1,"David");
		System.out.println("Size after adding" + names.size());
		
		System.out.println("Elements in list");
		for(String name:names)
		{
			System.out.println(name);
		}
		
		System.out.println("After clearing, size" + names.size());
	}
}
