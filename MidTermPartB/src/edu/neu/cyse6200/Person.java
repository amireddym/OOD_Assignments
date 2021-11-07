package edu.neu.cyse6200;

import java.util.Comparator;

public class Person extends AbstractPersonAPI implements Comparable<Person>{

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int getId() {
		
		return id;
	}

	@Override
	public void setId(int id) {
		
		this.id=id;
	}

	@Override
	public String getFirstName() {
		
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		
		this.firstName=firstName;
	}

	@Override
	public String getLastName() {
		
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		
		this.lastName=lastName;
	}

	@Override
	public int getAge() {
		
		return age;
	}

	@Override
	public void setAge(int age) {
		
		this.age=age;
	}

	@Override
	public void show() {
		
		System.out.println("Id : "+id+" FirstName : "+firstName+" LastName : "+lastName+" Age : "+age);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		
		return Integer.compare(getId(), o.getId());
	}
	
}
