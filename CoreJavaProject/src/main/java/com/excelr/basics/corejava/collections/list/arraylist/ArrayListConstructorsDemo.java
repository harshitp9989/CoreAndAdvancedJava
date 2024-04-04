package com.excelr.basics.corejava.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListConstructorsDemo {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("Hai");
		
		
		ArrayList<Integer> arrI = new ArrayList<> (5);
		arrI.add(10);
		arrI.add(200);
		arrI.add(500);
		
		ArrayList<String> existingArr = new ArrayList<> (arr);
		existingArr.add("New value");
		
		System.out.println(arr);
		System.out.println(arrI);
		System.out.println(existingArr);
		
	}
}
