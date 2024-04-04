package com.excelr.basics.multiThreading.StarvationExample;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class StarvationSolution2 {

	private static Lock lock = new ReentrantLock();
	private static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while (true) {
				try {
					lock.lock();
					System.out.println("Thread 1 is running...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			while (true) {
				try {
					lock.lock();
					System.out.println("Thread 2 is running...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
	
	
		t1.start();
		t2.start();
	}
}
