package com.excelr.basics.multiThreading;

public class ThreadTask extends Thread{
@Override
public void run()
{
	System.out.println("Thread Name: "+ Thread.currentThread().getName() + "\t"+ "Thread Priority: "+ Thread.currentThread().getPriority());
}
	
}
