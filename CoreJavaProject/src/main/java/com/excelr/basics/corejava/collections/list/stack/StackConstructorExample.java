package com.excelr.basics.corejava.collections.list.stack;

import java.util.Stack;

public class StackConstructorExample {

	public static void main(String[] args) {
		Stack<Integer> defaultStack = new Stack<>();
		defaultStack.push(1);
		defaultStack.push(2);
		defaultStack.push(3);
		defaultStack.push(4);
		defaultStack.push(5);

		displayContents(defaultStack);

	}

	public static void displayContents(Stack<Integer> stack) {
		System.out.println("Stack Contents");
		while (!stack.isEmpty()) {

			System.out.println(stack.pop());
		}
		System.out.println();
	}

}
