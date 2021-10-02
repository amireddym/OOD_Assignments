package edu.neu.cyse6200;

public class LionAbstract extends AbstractAnimalAPI{

	@Override
	public void makeSound() {
		
		System.out.println("Making sound from LionAbstract class");		
	}
	
	@Override
	public String toString() {
		
		return "To String method from LionAbstract class";
	}

}
