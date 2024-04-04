package com.excelr.basics.corejava.collections.list.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(null);
		stack.push(30);

		System.out.println("Stack: "+ stack);
		
		System.out.println("Popped: "+ stack.pop());
		System.out.println("Stack after pop:"+ stack);
		
		System.out.println("Top element (peek): "+ stack.peek());
		
		System.out.println("Is the stack empty? :"+ stack.isEmpty());
		
		System.out.println("Size of stack: "+ stack.size());
		
		stack.clear();
		
		System.out.println("Stack after clearing"+ stack);
	}
}
