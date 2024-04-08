package com.excelr.basics.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println("Queue Original :"+ queue);
		
		int front = queue.poll();
		System.out.println("Front element: "+ front);
		System.out.println("Queue now: "+ queue);
		
		int peek = queue.peek();
		System.out.println("Front element(peek): "+ peek);
		System.out.println("Queue now: "+ queue);
	}
}
