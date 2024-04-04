package com.excelr.basics.multiThreading.mutex;

import java.util.concurrent.locks.ReentrantLock;

public class WithoutMutexExampleMain {
	private int count =0;
	private ReentrantLock lock = new ReentrantLock();
	
	public void increment()
	{
			count++;
	}
	
	public int getCount()
	{
			return count;
	}
	
	public static void main(String[] args) {
		WithoutMutexExampleMain example = new WithoutMutexExampleMain();
		
		Thread thread1 = new Thread(
				()->
				{
					for(int i=0; i<100000; i++)
					{
						example.increment();
					}
				});
		
		Thread thread2 = new Thread(
				()->
				{
					for(int i=0; i<100000; i++)
					{
						example.increment();
					}
				});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Final Count"+example.getCount());
	}
}
