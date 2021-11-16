package edu.neu.csye6200;

public class QueueInt {

	
	private int front;
	
	private int rear;
	
	private int[] arrayInt;
	
	private int capacity;
	
	private int count;

	public QueueInt( int size) {
		this.capacity = size;
		this.arrayInt = new int[size];
		this.front=0;
		this.rear=-1;
		this.count=0;
		
	}
	
	public void enqueue(int item) {
		
		if(isFull()) {
			System.out.println("Queue is Full. Cannot be inserted");
			return;
		}
		System.out.println("Inserting item into the Queue");
		rear = (rear+1)%capacity;
		arrayInt[rear] = item;
		count++;
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Already Empty.");
			return;
		}
		System.out.println("Removing item at the front : "+arrayInt[front]);
		front = (front+1)%capacity;
		count--;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty. Nothing to peek");
			return Integer.MIN_VALUE;
		}
		
		System.out.println("Returning the Top one");
		return arrayInt[front];
		
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
			st.append(arrayInt[i]+"->");
		}
		st.append(arrayInt[rear]);
		return st.toString();
	}
	
}
