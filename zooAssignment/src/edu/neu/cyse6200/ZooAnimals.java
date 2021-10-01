package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
	
	private List<AnimalAPI> animalApis;
	
	public ZooAnimals() {
		animalApis = new ArrayList<>();
	}
	
	public void demo() {
		
		animalApis.add(new AnimalAPI());
		animalApis.add(new Lion());
		animalApis.add(new Tiger());
		animalApis.add(new Elephent());
		
		for(AnimalAPI animalAPI:animalApis) {
			
			animalAPI.makeSound();
			animalAPI.toString();
		}
	}

}
