package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Person> getTeachersList() {
		
		List<Person> teachers = new ArrayList<>();
		teachers.add(new Teacher(13, 34, "Anshita","Verma","Ravi", "Verma", 15.5));
		
		return teachers;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "," + hourlyWage;
	}
	
	public static void createObjects(List<String> objectsData) {
		
		String[] objectData = objectsData.get(0).split(",");
		int id =0;
		int age=0;
		double hourlyWage=0;
			
		try {
		 id = Integer.parseInt(objectData[0]);
		}catch(Exception e) {
			System.out.println("Unable to Parse ID from csv");
			System.out.println(e.getMessage());
		}
		
		try {
		 age = Integer.parseInt(objectData[1]);
		} catch (Exception e) {
			System.out.println("Unable to Parse Age from csv");
			System.out.println(e.getMessage());
		}
		String firstName = objectData[2];
		String lastName = objectData[3];
		String parentFirstName = objectData[4];
		String parentLastName = objectData[5];
		
		try {
		 hourlyWage = Double.parseDouble(objectData[6]);
		} catch (Exception e) {
			System.out.println("Unable to Parse HourlyAge from csv");
			System.out.println(e.getMessage());
		}
		
		Teacher teacher  = new Teacher(id, age, firstName, lastName, parentFirstName, parentLastName, hourlyWage);
		
		System.out.println("Printing Teacher Object data");
		System.out.println(teacher.toString());
	}
	
}
