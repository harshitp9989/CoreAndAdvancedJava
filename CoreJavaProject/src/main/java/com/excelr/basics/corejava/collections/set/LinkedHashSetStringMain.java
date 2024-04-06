package com.excelr.basics.corejava.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

import com.excelr.basics.corejava.collections.linkedList.Product;

public class LinkedHashSetStringMain {

	public static void main(String[] args) {
		Set<String> players = new LinkedHashSet<>();
		players.add("Dhoni");
		players.add("Rishabh");
		players.add("Kohli");
		players.add("z");
		players.add("z");//duplicate

		LinkedHashSetStringMain obj = new LinkedHashSetStringMain();

//		System.out.println("---------Printing using iterateUsingForLoop loop-------\n");
//		obj.iterateUsingForLoop(players);
//		System.out.println();
		
		System.out.println("---------Printing using iterateUsingForEachLoop loop-------\n");
		obj.iterateUsingForEachLoop(players);
		System.out.println();
		
		System.out.println("---------Printing using iterateUsingLambda loop-------\n");
		obj.iterateUsingLambda(players);
		System.out.println();

		System.out.println("---------Printing using iterateUsingIterator loop-------\n");
		obj.iterateUsingIterator(players);
		System.out.println();

//		System.out.println("---------Printing using iterateUsingListIterator loop-------\n");
//		obj.iterateUsingListIterator(players);
//		System.out.println();
		
//		System.out.println("---------Printing using iterateUningIndex loop-------\n");
//		obj.iterateUningIndex(players);
//		System.out.println();
	}
	
	
//	private void iterateUsingForLoop(Set<String> players)
//	{
//		if(!CollectionUtils.isEmpty(players))
//		{
//			for(int i=0;i<players.size();i++)
//			{
//				System.out.println(players.get(i)); //The method get(int) is undefined for the type Set<String>
//			}
//		}
//	}
	
	private void iterateUsingForEachLoop(Set<String> players)
	{
		if(!CollectionUtils.isEmpty(players))
		{
			for(String player: players)
			{
				System.out.println(player);
			}
		}
	}
	
	private void iterateUsingLambda(Set<String> players)
	{
		if(!CollectionUtils.isEmpty(players))
		{
			players.forEach(item -> System.out.println(item));
		}
	}
	
	private void iterateUsingIterator(Set<String> players)
	{
		if(!CollectionUtils.isEmpty(players))
		{
			Iterator<String> iterator = players.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	}
	
//	private void iterateUsingListIterator(Set<String> players)
//	{
//		// Since LinkedHashSet doesn't maintain index order, list iterator will
//        // just iterate in the insertion order
//		if(!CollectionUtils.isEmpty(players))
//		{
//			ListIterator<String> listIterator = players.listIterator();
//			
//			System.out.println("Forward direction");
//			while(listIterator.hasNext())
//			{
//				System.out.println(listIterator.next());
//			}
//			
//			System.out.println("Backward direction");
//			while(listIterator.hasPrevious())
//			{
//				System.out.println(listIterator.previous());
//			}
//		}
//	}
//	
//	private void iterateUningIndex(Set<String> players)
//	{
//		if(!CollectionUtils.isEmpty(players))
//		{
//			System.out.println(players.get(0));
//			System.out.println(players.get(1));
//			System.out.println(players.get(2));
//
//		}
//	}
}
