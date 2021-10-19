package edu.neu.cyse6200;

public class Item {

	protected int id;
	
	protected String name;
	
	protected double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int sortById(Item item) {
		
		return Integer.compare(getId(), item.getId());
	}
	
	public int sortByName(Item item) {
		
		return getName().compareToIgnoreCase(item.getName());
	}
	
	public int sortByPrice(Item item) {
		
		return Double.compare(getPrice(), item.getPrice());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
