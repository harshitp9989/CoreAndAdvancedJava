package com.excelr.basics.multiThreading.locks.blockSynchronised;

 class ObjectLevelSync {

	public synchronized void syncMethod()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println("Sync method:"+i);
		}
	}
	
	public void syncBlock()
	{
		synchronized(this)
		{
			for(int i=0; i<5;i++)
			{
				System.out.println("Sync block:"+i);
			}
		}
	}
}

public class ObjectLevelSyncDemo{
	
	public static void main(String[] args) {
		ObjectLevelSync obj = new ObjectLevelSync();
		
		Thread thread1 = new Thread(()->
		{
			obj.syncMethod();
		});
		
		Thread thread2 = new Thread(()->
		{
			obj.syncBlock();

		});
		
		thread1.start();
		thread2.start();
	}
}
