package com.excelr.basics.multiThreading.StarvationExample;

public class StarvationExample3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                SharedResource2.performOperation(Thread.currentThread());
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                SharedResource2.performOperation(Thread.currentThread());
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        
    }
}

class SharedResource2 {
    public static synchronized void performOperation(Thread callingThread) {
        if (callingThread.getName().equals("Thread-0")) {
            System.out.println("Thread 1 is running...");
        } else if (callingThread.getName().equals("Thread-1")) {
            System.out.println("Thread 2 is running...");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
