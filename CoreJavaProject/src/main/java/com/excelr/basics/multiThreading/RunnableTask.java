package com.excelr.basics.multiThreading;

public class RunnableTask implements Runnable{

	@Override
	public void run()
	{
		System.out.println("Main Thread Name: "+ Thread.currentThread().getName() + "\t"+ "Thread Priority: "+ Thread.currentThread().getPriority());
	}
}
