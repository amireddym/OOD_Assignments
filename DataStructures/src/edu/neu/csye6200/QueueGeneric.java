package edu.neu.csye6200;

public class QueueGeneric<T> {

	private int front;

	private int rear;

	private T[] genericArray;

	private int capacity;

	private int count;

	public QueueGeneric(int size) {
		this.capacity = size;
		this.count = 0;
		this.rear = -1;
		this.front = 0;
		this.genericArray = (T[]) new Object[size];

	}

	public void enqueue(T item) {

		if (isFull()) {
			System.out.println("Queue is Full. Cannot be inserted");
			return;
		}
		System.out.println("Inserting item into the Queue");
		rear = (rear + 1) % capacity;
		genericArray[rear] = item;
		count++;
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Already Empty.");
			return;
		}
		System.out.println("Removing item at the front : " + genericArray[front]);
		front = (front + 1) % capacity;
		count--;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Nothing to peek");
			return null;
		}

		System.out.println("Returning the Top one");
		return genericArray[front];

	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == capacity);
	}

	@Override
	public String toString() {

		if (isEmpty()) {
			return "";
		}
		StringBuilder st = new StringBuilder();
		for (int i = front; i < rear; i++) {
			st.append(genericArray[i] + "->");
		}
		st.append(genericArray[rear]);
		return st.toString();
	}

}
