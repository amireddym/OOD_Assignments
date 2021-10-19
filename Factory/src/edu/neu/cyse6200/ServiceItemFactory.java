package edu.neu.cyse6200;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceItemFactory extends BaseFactory{

	private static Map<String,Item> serviceItemsMap = new HashMap<>();
	
	static {
		
		List<String> csvStrings = FileUtil.readDataFromFile("src/edu/neu/cyse6200/serviceItemCSV.txt");
		
		for(String csv:csvStrings) {
			Item item = ServiceItem.getServiceItem(csv);
			serviceItemsMap.put(item.getName(), item);			
		}
	}
	
	
	@Override
	public Item getItem(String name) {
		
		return serviceItemsMap.get(name);
	}

}
