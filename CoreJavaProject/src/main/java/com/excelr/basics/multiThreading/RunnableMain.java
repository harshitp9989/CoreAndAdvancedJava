package com.excelr.basics.multiThreading;

public class RunnableMain {

	public static void main(String[] args) {
	System.out.println("Main Thread Name: "+ Thread.currentThread().getName() + "\t"+ "Thread Priority: "+ Thread.currentThread().getPriority());
	
	RunnableTask task = new RunnableTask();
	
	Thread thread1 = new Thread(task);
	thread1.start();
	
	Thread thread2 = new Thread(task);
	thread2.start();
	
	Thread thread3 = new Thread(task);
	thread3.setPriority(7);
	thread3.setName("My special thread");
	thread3.start();
//	thread3.start();
//	thread3.run() ; //avoid using run directly
	
	}
}
