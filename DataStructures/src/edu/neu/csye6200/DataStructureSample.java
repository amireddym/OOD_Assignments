package edu.neu.csye6200;

public class DataStructureSample {

	public static void demo() {
		
		
		System.out.println("Checking Stack with Integer Array");
		StackInt stackInt = new StackInt(5);
		stackInt.push(10);
		stackInt.push(14);
		stackInt.push(4);
		System.out.println(stackInt.toString());
		System.out.println("Poping from the stack");
		stackInt.pop();
		System.out.println(stackInt.toString());
		System.out.println("Peek of the stack");
		System.out.println(stackInt.peek());
		System.out.println(stackInt.size());
		stackInt.pop();
		System.out.println(stackInt.size());
		stackInt.pop();
		System.out.println(stackInt.size());
		System.out.println("Stack is empty Now");
		System.out.println(stackInt.toString());
		
		System.out.println("----------------------------------------");
		System.out.println();
		
		System.out.println("Checking Stack with Generic dataType");
		StackGeneric<String> stackGeneric = new StackGeneric<>(5);
		stackGeneric.push("manoj");
		stackGeneric.push("dheeraj");
		stackGeneric.push("shashank");
		System.out.println(stackGeneric.toString());
		System.out.println("Poping from the stack");
		stackGeneric.pop();
		System.out.println(stackGeneric.toString());
		System.out.println("Peek of the stack");
		System.out.println(stackGeneric.peek());
		System.out.println(stackGeneric.size());
		stackGeneric.pop();
		System.out.println(stackGeneric.size());
		stackGeneric.pop();
		System.out.println(stackGeneric.size());
		System.out.println("Stack is empty Now");
		System.out.println(stackGeneric.toString());
		
		System.out.println("----------------------------------------");
		System.out.println();
		
		System.out.println("Checking Queue with Int dataType");		
		QueueInt queueInt = new QueueInt(5);
		queueInt.enqueue(10);
		queueInt.enqueue(13);
		queueInt.enqueue(2);
		System.out.println("Priniting intial Values");
		System.out.println(queueInt.toString());
		System.out.println("Dequeing from Stack");
		queueInt.deQueue();
		System.out.println(queueInt.toString());
		System.out.println("Peek of the Queue");
		System.out.println(queueInt.peek());
		System.out.println(queueInt.size());
		queueInt.deQueue();
		System.out.println(queueInt.size());
		queueInt.deQueue();
		System.out.println(queueInt.size());
		System.out.println("Queue is Empty Now");
		System.out.println(queueInt.toString());
		
		System.out.println("----------------------------------------");
		System.out.println();
		
		System.out.println("Checking Queue with Generic dataType");	
		QueueGeneric<String> queueGeneric = new QueueGeneric<>(5);
		queueGeneric.enqueue("raja");
		queueGeneric.enqueue("pratheek");
		queueGeneric.enqueue("raviteja");
		System.out.println("Priniting intial Values");
		System.out.println(queueGeneric.toString());
		System.out.println("Dequeing from Stack");
		queueGeneric.deQueue();
		System.out.println(queueGeneric.toString());
		System.out.println("Peek of the Queue");
		System.out.println(queueGeneric.peek());
		System.out.println(queueGeneric.size());
		queueGeneric.deQueue();
		System.out.println(queueGeneric.size());
		queueGeneric.deQueue();
		System.out.println(queueGeneric.size());
		System.out.println("Queue is Empty Now");
		System.out.println(queueGeneric.toString());
		
		
	}
}
