package edu.neu.cyse6200;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicItemFactory extends BaseFactory{

	
	private static Map<String,Item> electronicItemsMap = null;
	
	private static ElectronicItemFactory electronicItemFactory =null;
		
	@Override
	public Item getItem(String name) {
		
		if(electronicItemsMap==null) {
			
			electronicItemsMap = new HashMap<>();
			List<String> csvStrings = FileUtil.readDataFromFile("src/edu/neu/cyse6200/electronicItemCSV.txt");
			
			for(String csv:csvStrings) {
				Item item = ElectronicItem.getElectronicItem(csv);
				electronicItemsMap.put(item.getName(), item);			
			}
		}
		
		return electronicItemsMap.get(name);
	}
	
	public static BaseFactory getElectronicItemFactory() {
		
		if(electronicItemFactory==null) {
			electronicItemFactory = new ElectronicItemFactory();
		}
		
		return electronicItemFactory;
	}

}