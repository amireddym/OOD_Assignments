package edu.neu.cyse6200;

public class ServiceItem extends Item{

	private ServiceItem(String csv) {
		
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
	
	public static Item getServiceItem(String csv) {
		
		return new ServiceItem(csv);
	}
	
	@Override
	public String toString() {
		return "ServiceItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
