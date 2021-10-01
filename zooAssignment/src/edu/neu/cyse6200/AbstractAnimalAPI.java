package edu.neu.cyse6200;

public abstract class AbstractAnimalAPI {
	
	public abstract void makeSound();
	
	@Override
	public String toString() {
		
		System.out.println("To String method from Abstarct AbstractAnimalAPI class");
		return super.toString();
	}

}
