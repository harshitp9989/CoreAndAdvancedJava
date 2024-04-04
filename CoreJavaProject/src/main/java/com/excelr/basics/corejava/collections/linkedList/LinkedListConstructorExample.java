package com.excelr.basics.corejava.collections.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections4.CollectionUtils;

public class LinkedListConstructorExample {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Sprite");
		product1.setDescription("A soft drink");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Ice cream");
		product2.setDescription("A dessert item");
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Biryani");
		product3.setDescription("Main course");
		
		
		List<Product> products = new LinkedList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);

		LinkedListConstructorExample obj = new LinkedListConstructorExample();
		
		System.out.println("-------Printing iterateUsingForLoop--------------");
		obj.iterateUsingForLoop(products);
		System.out.println();
		
		System.out.println("-------Printing iterateUsingForEachLoop--------------");
		obj.iterateUsingForEachLoop(products);
		System.out.println();
		
		System.out.println("-------Printing iterateUsingLambda--------------");
		obj.iterateUsingLambda(products);
		System.out.println();
		
		System.out.println("-------Printing iterateUsingIterator--------------");
		obj.iterateUsingIterator(products);
		System.out.println();
		
		System.out.println("-------Printing iterateUsingListIterator--------------");
		obj.iterateUsingListIterator(products);
		System.out.println();
		
		
	}
	
	private void iterateUsingForLoop(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			for(int i=0;i<products.size();i++)
			{
				System.out.println(products.get(i));
			}
		}
	}
	
	private void iterateUsingForEachLoop(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			for(Product product: products)
			{
				System.out.println(product);
			}
		}
	}
	
	private void iterateUsingLambda(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			products.forEach(item -> System.out.println(item));
		}
	}
	
	private void iterateUsingIterator(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			Iterator<Product> iterator = products.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	}
	
	private void iterateUsingListIterator(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			ListIterator<Product> listIterator = products.listIterator();
			
			System.out.println("Forward direction");
			while(listIterator.hasNext())
			{
				System.out.println(listIterator.next());
			}
			
			System.out.println("Backward direction");
			while(listIterator.hasPrevious())
			{
				System.out.println(listIterator.previous());
			}
		}
	}
	
	private void iterateUningIndex(List<Product> products)
	{
		if(!CollectionUtils.isEmpty(products))
		{
			System.out.println(products.get(0));
			System.out.println(products.get(1));
			System.out.println(products.get(2));

		}
	}
}
