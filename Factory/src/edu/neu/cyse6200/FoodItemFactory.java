package edu.neu.cyse6200;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodItemFactory extends BaseFactory{
	
	
	private static Map<String,Item> foodItemsMap = new HashMap<>();
	
	public FoodItemFactory() {
		
		List<String> csvStrings = FileUtil.readDataFromFile("src/edu/neu/cyse6200/foodItemCSV.txt");
		
		for(String csv:csvStrings) {
			Item item = new FoodItem(csv);
			foodItemsMap.put(item.getName(), item);			
		}
	}

	@Override
	public Item getItem(String name) {
		
		return foodItemsMap.get(name);
	}
	
	
}
