package com.excelr.basics.corejava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
/**
 * 
 */
public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(null);
		numbers.add(100);
		
		System.out.println("Element0 "+numbers.get(0));
		System.out.println("Element1 "+numbers.get(1));
		System.out.println("Element2 "+numbers.get(2));
		System.out.println("Element3 "+numbers.get(3));
		System.out.println("Element5 "+numbers.get(4));

		System.out.println("Size of numbers ArrayList: "+numbers.size());
	
		numbers.remove(1);
		System.out.println("Size of numbers ArrayList after removal: "+numbers.size());

		System.out.println("contains 30? "+ numbers.contains(30));
		System.out.println("contains null? "+ numbers.contains(null));

		try
		{
			System.out.println("Elements in the arraylist");
			for(int x:numbers)
			{
				System.out.print(x + "->");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			numbers.remove(2);
			System.out.println("Elements in the arraylist");
			for(int x:numbers)
			{
				System.out.print(x + "->");
			}
		}
		
		
	}
}
