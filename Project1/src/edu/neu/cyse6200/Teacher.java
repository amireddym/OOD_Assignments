package edu.neu.cyse6200;

public class Teacher extends Person{

	private double hourlyWage;

	public Teacher(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			double hourlyWage) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.hourlyWage = hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
}
