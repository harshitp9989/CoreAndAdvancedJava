package com.excelr.basics.corejava.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueAsQueue {

	
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println("Queue Original :"+ queue);
		
		int front = queue.take();
		System.out.println("Front element: "+ front);
		System.out.println("Queue now: "+ queue);
		
		int peek = queue.peek();
		System.out.println("Front element(peek): "+ peek);
		System.out.println("Queue now: "+ queue);
    }
}
