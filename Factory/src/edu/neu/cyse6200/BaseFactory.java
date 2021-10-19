package edu.neu.cyse6200;

public class BaseFactory {
	
	public BaseFactory getFactory(String factoryType) {
		
		switch(factoryType) {
		
			case("Food"):
				return new FoodItemFactory();
			case("Service"):
				return new ServiceItemFactory();
			case("Electronic"):
				return new ElectronicItemFactory();
		}
		return null;
		
	}
	
	public Item getItem(String name) {
		return new Item();
	}

}
