package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstarctAnimals {
	
	private List<AbstractAnimalAPI> abstractAnimalApis;
	
	public ZooAbstarctAnimals() {
		this.abstractAnimalApis = new ArrayList<>();
	}
	
	public void demo() {
		
		abstractAnimalApis.add(new LionAbstract());
		abstractAnimalApis.add(new TigerAbstract());
		abstractAnimalApis.add(new ElephantAbstarct());
		
		for(AbstractAnimalAPI abstractAnimalAPI:abstractAnimalApis) {
			
			abstractAnimalAPI.makeSound();
			System.out.println(abstractAnimalAPI.toString());
		}
	}

}
