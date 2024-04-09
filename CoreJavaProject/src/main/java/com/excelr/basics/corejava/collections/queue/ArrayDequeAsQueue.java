package com.excelr.basics.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new ArrayDeque<>();
		
		queue1.offer(10);
		queue1.offer(20);
		queue1.offer(30);
		System.out.println("Queue Original :"+ queue1);
		
		int front = queue1.poll();
		System.out.println("Front element: "+ front);
		System.out.println("Queue now: "+ queue1);
		
		int peek = queue1.peek();
		System.out.println("Front element(peek): "+ peek);
		System.out.println("Queue now: "+ queue1);
	}
}
