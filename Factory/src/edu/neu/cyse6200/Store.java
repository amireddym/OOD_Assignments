package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

public class Store extends AbstractStore{

	@Override
	public void demo() {
		
		List<Item> items = new ArrayList<>();
		
		BaseFactory bf = new BaseFactory();
		
		
		items.add(bf.getFactory("Food").getItem("snickers"));
		items.add(bf.getFactory("Food").getItem("biryani"));

		items.add(bf.getFactory("Electronic").getItem("xbox"));
		items.add(bf.getFactory("Electronic").getItem("playstation"));

		items.add(bf.getFactory("Service").getItem("drycleaning"));
		items.add(bf.getFactory("Service").getItem("gardening"));		
		
		
		System.out.println("---------------------------------------");
		System.out.println("Items List before Sorting");
		
		items.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Items List after Sorting by ID");	
		items.sort(Item::sortById);
		items.forEach(System.out::println);

		
		System.out.println("---------------------------------------");
		System.out.println("Items List after Sorting by Name");	
		items.sort(Item::sortByName);
		items.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Items List after Sorting by Price");	
		items.sort(Item::sortByPrice);
		items.forEach(System.out::println);
		
	}

}
