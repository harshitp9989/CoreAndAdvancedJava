package com.excelr.basics.corejava.collections.concurrentcollections;
import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> celebs = new ConcurrentHashMap<>();

		Thread addThread = new Thread(() -> {
			celebs.put("India", "Narendra Modi");
			celebs.put("Andhra", "Jagan Mohan Reddy");
			celebs.put("Bengal", "Mamata Banerjee");
			System.out.println("Writing elements into concurrentHashMap");

		});

		Thread readThread = new Thread(() -> {
			System.out.println("Reading emements from concurrentHashMap");
			for (String key : celebs.keySet()) {
				System.out.println(key + "---->" + celebs.get(key));
			}
		});

		readThread.start();
		addThread.start();

		try {
			readThread.join();
			addThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
