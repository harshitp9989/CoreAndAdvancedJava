package com.excelr.basics.multiThreading;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Thread Name: "+ Thread.currentThread().getName() + "\t"+ "Thread Priority: "+ Thread.currentThread().getPriority());
	
	
	ThreadTask thread1 = new ThreadTask();
	thread1.start();
	
	ThreadTask thread2 = new ThreadTask();
	thread2.start();
	
	ThreadTask thread3 = new ThreadTask();
	thread3.setPriority(7);
	thread3.setName("My special thread");
	thread3.run();
//	thread3.start();
//	thread3.run() ; //avoid using run directly
	
	}
}
