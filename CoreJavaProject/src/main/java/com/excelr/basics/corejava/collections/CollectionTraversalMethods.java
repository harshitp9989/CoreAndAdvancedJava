package com.excelr.basics.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTraversalMethods {

	public static void main(String[] args) {
		
		List<String> colors= new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("yellow");
		colors.add("Green");
		
		Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		for(String color : colors)
		{
			System.out.println(color);
		}
		
		ListIterator<String> listIteratorForward = colors.listIterator();
		while(listIteratorForward.hasNext())
		{
			System.out.print(listIteratorForward.next() + " - ");
		}
		
		System.out.println();
		
		ListIterator<String> listIteratorBackward = colors.listIterator(colors.size());
		while(listIteratorBackward.hasPrevious())
		{
			System.out.print(listIteratorBackward.previous() + " - ");
		}
		
		System.out.println();
		for(int i=0; i<colors.size(); i++)
		{
			System.out.println(colors.get(i));
		}
		
		colors.forEach(color -> System.out.println(color));
		
		iterator = colors.iterator();
		iterator.forEachRemaining(color -> System.out.println(color));
	}
}
