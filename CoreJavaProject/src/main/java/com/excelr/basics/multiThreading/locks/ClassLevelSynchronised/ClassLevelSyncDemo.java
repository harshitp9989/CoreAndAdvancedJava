package com.excelr.basics.multiThreading.locks.ClassLevelSynchronised;

class ClassLevelSync {

	public static synchronized void staticSyncMethod()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println("Sync method:"+i);
		}
	}
	
	public static void staticSyncBlock()
	{
		synchronized(ClassLevelSync.class)
		{
			for(int i=0; i<5;i++)
			{
				System.out.println("Sync block:"+i);
			}
		}
	}
}

public class ClassLevelSyncDemo{
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(()->
		{
			ClassLevelSync.staticSyncMethod();
		});
		
		Thread thread2 = new Thread(()->
		{
			ClassLevelSync.staticSyncBlock();

		});
		
		thread1.start();
		thread2.start();
	}
}
