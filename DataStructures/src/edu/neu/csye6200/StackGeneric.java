package edu.neu.csye6200;

import java.util.ArrayList;

public class StackGeneric<T> {
	
	private int counter;
	
	private int capacity;
	
	private ArrayList<T> genericArray;

	public StackGeneric(int size) {
		this.counter = -1;
		this.capacity = size;
		this.genericArray = new ArrayList<T>(size);
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
	
	public void push(T a) {
		
		if(isFull()) {
			System.out.println("Stack is Full. Cannot be Inserted");
			return;
		}
		counter++;
		genericArray.add(a);
		
	}
	
	public void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty. Nothing to pop");
			return;
		}
		genericArray.remove(counter);
		counter--;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty. Nothing to Peek");
			return null;
		}
		
		return genericArray.get(counter);
	}	
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "";
		}
		StringBuilder st = new StringBuilder();
		for(int i=0;i<counter;i++) {
			st.append(genericArray.get(i) + "->");
		}
		st.append(genericArray.get(counter));
		return st.toString();
	}
	
}
