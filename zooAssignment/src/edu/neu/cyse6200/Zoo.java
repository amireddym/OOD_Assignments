package edu.neu.cyse6200;

public class Zoo {
	
	public Zoo() {
		
	}
	
	public static void demo() {
		
		System.out.println("");
		System.out.println("Runtime Polymorphism for Concrete class");
		ZooAnimals zooAnimals = new ZooAnimals();
		zooAnimals.demo();
		
		System.out.println("");
		
		System.out.println("Runtime Polymorphism for Abstract class");
		ZooAbstarctAnimals zooAbstarctAnimals = new ZooAbstarctAnimals();
		zooAbstarctAnimals.demo();
		
		System.out.println("");
		
		System.out.println("Runtime Polymorphism for Animalistic class");
		ZooAnimalisticAnimals zooAnimalisticAnimals = new ZooAnimalisticAnimals();
		zooAnimalisticAnimals.demo();
		
	}

}
