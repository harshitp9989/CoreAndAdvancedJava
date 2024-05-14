package com.corejavaprojects.basics.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsvsNonGenericDemoMain {

	public static void main(String[] args) {
		List nonGenericList = new ArrayList();
		nonGenericList.add("Apple");
		nonGenericList.add(123);
		
		String nonGenericStr = (String)nonGenericList.get(0);
		int nonGenericNum = (int)nonGenericList.get(1);
		
		System.out.println("Non-Generic List");
		
		System.out.println("Element 1:"+nonGenericStr);
		System.out.println("Element 2:"+nonGenericNum);
		
		List<String> genericList = new ArrayList<>();
		
		genericList.add("Hello");
		genericList.add("Hai");

		
		String genericStr = genericList.get(0);
		String genericStr2 = genericList.get(1);

		System.out.println("\nGeneric List:");
		
		System.out.println("Element1: "+ genericStr);
		System.out.println("Element1: "+ genericStr2);

	}
}
