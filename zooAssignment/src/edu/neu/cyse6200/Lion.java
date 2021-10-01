package edu.neu.cyse6200;

public class Lion  extends AnimalAPI{

	@Override
	public void makeSound() {
		
		System.out.println("Making sound from Lion class");
	}
	
	@Override
	public String toString() {
		
		System.out.println("To String method from Lion class");
		return "";
	}
}
