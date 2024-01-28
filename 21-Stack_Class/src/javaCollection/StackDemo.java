package javaCollection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();//define stack for integer type
		//push items into the stack
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		
		System.out.println("The stack size: " + myStack.size());
		System.out.println("The top element of the stack: " + myStack.peek());
		
		while(!myStack.isEmpty()) {//until the stack is not empty, pop and print elements
			System.out.println("Popped Item: " + myStack.pop());
			
		}
		
	}

}
