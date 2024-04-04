package com.excelr.basics.multiThreading.mutex;

import java.util.concurrent.locks.ReentrantLock;

public class MutexExampleMain {
	private int count =0;
	private ReentrantLock lock = new ReentrantLock();
	
	public void increment()
	{
		lock.lock();
		try {
			count++;
		}
		finally {
			lock.unlock();
		}
	}
	
	public int getCount()
	{
		lock.lock();
		try {
			return count;
		}
		finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		MutexExampleMain mutexExample = new MutexExampleMain();
		
		Thread thread1 = new Thread(
				()->
				{
					for(int i=0; i<100000; i++)
					{
						mutexExample.increment();
					}
				});
		
		Thread thread2 = new Thread(
				()->
				{
					for(int i=0; i<100000; i++)
					{
						mutexExample.increment();
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
		
		System.out.println("Final Count"+mutexExample.getCount());
	}
}
