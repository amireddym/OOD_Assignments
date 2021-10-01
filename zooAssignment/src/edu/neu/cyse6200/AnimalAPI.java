package edu.neu.cyse6200;

public class AnimalAPI {

	public void makeSound() {
		
		System.out.println("Making sound from Concrete AnimapAPI class");
	}
	
	@Override
	public String toString() {
		
		System.out.println("To String method from Concrete AnimapAPI class");
		return super.toString();
	}
}
