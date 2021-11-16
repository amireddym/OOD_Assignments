package edu.neu.csye6200;

import java.util.ArrayList;

public class QueueGeneric<T> {
	
	private int front;
	
	private int rear;
	
	private ArrayList<T> genericArray;
	
	private int capacity;
	
	private int count;

	public QueueGeneric(int size) {
		this.capacity = size;
		this.count=0;
		this.rear=-1;
		this.front=0;
		this.genericArray=new ArrayList<T>(size);
		
	}
	
	public void enqueue(T item) {
		
		if(isFull()) {
			System.out.println("Queue is Full. Cannot be inserted");
			return;
		}
		System.out.println("Inserting item into the Queue");
		genericArray.add(rear+1, item);
		rear++;
		count++;
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Already Empty.");
			return;
		}
		System.out.println("Removing item at the front : "+genericArray.get(front));
		front++;
		count--;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty. Nothing to peek");
			return null;
		}
		
		System.out.println("Returning the Top one");
		return genericArray.get(front);
		
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return (size()==0);
	}
	
	public boolean isFull() {
		return (size()==capacity);
	}
	
	@Override
	public String toString() {
		
		if(isEmpty()) {
			return "";
		}
		StringBuilder st = new StringBuilder();
		for(int i=front;i<rear;i++) {
			st.append(genericArray.get(i) + "->");
		}
		st.append(genericArray.get(rear));
		return st.toString();
	}
		

}
