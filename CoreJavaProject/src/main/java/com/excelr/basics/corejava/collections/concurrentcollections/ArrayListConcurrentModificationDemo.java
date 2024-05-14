package com.excelr.basics.corejava.collections.concurrentcollections;

import java.util.ArrayList;

public class ArrayListConcurrentModificationDemo {

	public static void main(String[] args) {
		ArrayList<String> people = new ArrayList<>();
		people.add("Narendra Modi");
		people.add("Jagan Mohan Reddy");
		people.add("Mamata Banerjee");
		
		Thread readThread = new Thread(()->
		{
			System.out.println("Reading elements from ArrayList:");
			for(String person: people)
			{
				System.out.println(person);
			}
		});
		
		Thread addThread = new Thread(()->
		{
			System.out.println("Adding elements to ArrayList:");
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
