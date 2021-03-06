package edu.neu.cyse6200;

public class ElectronicItem extends Item{

	private ElectronicItem(String csv) {
		
		String[] objectData = csv.split(",");
		int id = 0;
		double price =0;
		String name = objectData[1];
		
		try {
			id = Integer.parseInt(objectData[0]);
		} catch (Exception e) {
			System.out.println("Error in Parsing ID from csv data");
			System.out.println(e.getMessage());
		}
		
		try {
			price = Double.parseDouble(objectData[2]);
		} catch (Exception e) {
			System.out.println("Error in Parsing Price from csv data");
			System.out.println(e.getMessage());
		}

		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	public static Item getElectronicItem(String csv) {
		
		return new ElectronicItem(csv);
	}
	
	@Override
	public String toString() {
		return "ElectronicItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}
