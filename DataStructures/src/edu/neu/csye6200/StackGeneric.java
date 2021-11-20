package edu.neu.csye6200;

public class StackGeneric<T> {

	private int counter;

	private int capacity;

	private T[] genericArray;

	public StackGeneric(int size) {
		this.counter = -1;
		this.capacity = size;
		this.genericArray = (T[]) new Object[size];
	}

	public int size() {
		return counter + 1;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == capacity);
	}

	public void push(T a) {

		if (isFull()) {
			System.out.println("Stack is Full. Cannot be Inserted");
			return;
		}
		counter++;
		genericArray[counter] = a;

	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is Empty. Nothing to pop");
			return;
		}
		counter--;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty. Nothing to Peek");
			return null;
		}

		return genericArray[counter];
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < counter; i++) {
			st.append(genericArray[i] + "->");
		}
		st.append(genericArray[counter]);
		return st.toString();
	}

}
