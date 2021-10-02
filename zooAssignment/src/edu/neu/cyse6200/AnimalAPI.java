package edu.neu.cyse6200;

public class AnimalAPI {

	public void makeSound() {
		
		System.out.println("Making sound from Concrete AnimalAPI class");
	}
	
	@Override
	public String toString() {
		
		return "To String method from Concrete AnimalAPI class";
	}
}
