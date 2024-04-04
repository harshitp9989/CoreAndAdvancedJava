package com.excelr.basics.multiThreading.StarvationExample;

public class StarvationExample {

	public static Object sharedObj = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (sharedObj) {
				while (true) {
					System.out.println("Thread 1 is running...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		Thread t2 = new Thread(() -> {
			synchronized (sharedObj) {
				while (true) {
					System.out.println("Thread 2 is running...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}
