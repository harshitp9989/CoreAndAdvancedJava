package com.excelr.basics.multiThreading.StarvationExample;

public class StarvationExample2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (true) {
            	SharedResource.thread1Operation();
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
            	SharedResource.thread2Operation();
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

class SharedResource {
    public static synchronized void thread1Operation() {
        System.out.println("Thread 1 is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void thread2Operation() {
        System.out.println("Thread 2 is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
