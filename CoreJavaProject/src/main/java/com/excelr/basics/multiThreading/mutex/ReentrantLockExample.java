package com.excelr.basics.multiThreading.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		
		SharedResource resource = new SharedResource();
		
		Thread thread1 = new Thread(new Worker(lock, resource, "Thread1"));
		Thread thread2 = new Thread(new Worker(lock, resource, "Thread2"));

		thread1.start();
		thread2.start();
	}
}

class SharedResource{
	int count = 0;
}

class Worker implements Runnable {
	private Lock lock;
	private SharedResource resource;
	private String name;
	
	public Worker(Lock lock, SharedResource resource, String name)
	{
		this.lock = lock;
		this.resource = resource;
		this.name = name;
	}
	
	@Override
    public void run() {
        lock.lock();
        try {
            System.out.println(name + " has acquired the lock");
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": Count is now " + resource.count);
                resource.count++;
            }
        } finally {
            lock.unlock();
            System.out.println(name + " has released the lock.");
        }
    }
	
}
