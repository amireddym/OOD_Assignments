package edu.neu.cyse6200;

public class TigerAbstract extends AbstractAnimalAPI{

	@Override
	public void makeSound() {
		
		System.out.println("Making sound from TigerAbstract class");
	}
	
	@Override
	public String toString() {
		
		System.out.println("To String method from TigerAbstract class");
		return "";
	}

}
