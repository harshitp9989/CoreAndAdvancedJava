package com.excelr.basics.multiThreading;

class Counter{
	private int value = 0;
	
	public synchronized void increment()
	{
		value++;
	}
	
	public synchronized void decrement()
	{
		value--;
	}
	
	public int getValue()
	{
		return value;
	}
}

public class RaceconditionExample {

	public static void main(String[] args) {
		
		Counter cc = new Counter();
		
		Thread incThread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				cc.increment();
				System.out.println(i);
			}
		});
		
		
		Thread decThread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				cc.decrement();
				System.out.println("dec:"+i);
			}
		});
		
		
		incThread.start();
		decThread.start();
		
		try {
			incThread.join();
			decThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Counter value :"+ cc.getValue());
		
		
	}
}
