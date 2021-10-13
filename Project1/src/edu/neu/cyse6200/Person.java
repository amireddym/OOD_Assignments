package edu.neu.cyse6200;

public class Person {
	
	private int id;
	
	private int age;
	
	private String firstName;
	
	private String lastName;
	
	private String parentFirstName;
	
	private String parentLastName;
	
	

	public Person(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {

		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

}
