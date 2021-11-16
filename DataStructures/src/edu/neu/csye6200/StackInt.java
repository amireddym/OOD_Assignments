package edu.neu.csye6200;

public class StackInt {
	
	private int capacity;
	
	private int[] arrayInt;
	
	private int counter;

	public StackInt(int size) {
		this.capacity = size;
		this.arrayInt = new int[size];
		this.counter = -1;
	}
	
	public int size() {
		return counter+1;
	}
	
	public boolean isEmpty() {
		
		return (size()==0);
	}
	
	public boolean isFull() {
		
		return (size()==capacity);
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Nothing to Peek");
			return Integer.MIN_VALUE;
		}
		
		return arrayInt[counter];
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is Full. Cannot be pushed");
			return;
		}
		System.out.println("Pushing item on to the stack");
		arrayInt[counter+1]=item;
		counter = counter +1;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty. Cannot be popped");
			return;
		}
		counter = counter-1;
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "";
		}
		StringBuilder st = new StringBuilder();
		for(int i=0;i<counter;i++) {
			st.append(arrayInt[i] + "->");
		}
		st.append(arrayInt[counter]);
		return st.toString();
	}
	
}
