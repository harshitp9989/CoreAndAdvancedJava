package com.excelr.basics.corejava.collections.concurrentcollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> people = new CopyOnWriteArrayList<>();
		people.add("Narendra Modi");
		people.add("Jagan Mohan Reddy");
		people.add("Mamata Banerjee");
		
		Thread readThread = new Thread(()->
		{
			System.out.println("Reading elements from CopyOnWriteArrayList:");
			for(String person: people)
			{
				System.out.println(person);
			}
		});
		
		Thread addThread = new Thread(()->
		{
			System.out.println("Adding elements to CopyOnWriteArrayList:");
			people.add("Amit Shah");
			people.add("Aravind Kejriwal");
		});
		
		readThread.start();
		addThread.start();
		
		try {
			readThread.join();
			addThread.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
