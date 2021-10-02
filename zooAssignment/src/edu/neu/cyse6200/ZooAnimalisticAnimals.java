package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAnimals {
	
	
	private List<AnimalisticAPI> animalisticApis;
	
	public ZooAnimalisticAnimals() {
		
		this.animalisticApis = new ArrayList<>();
	}
	
	public void demo() {
		
		animalisticApis.add(new LionAnimalistic());
		animalisticApis.add(new TigerAnimalistic());
		animalisticApis.add(new ElephantAnimalistic());
		
		for(AnimalisticAPI animalisticAPI:animalisticApis) {
			
			animalisticAPI.makeSound();
			System.out.println(animalisticAPI.toString());
		}
	}

	
}
