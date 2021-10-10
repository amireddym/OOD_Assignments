package edu.neu.cyse6200;

public class Person implements Comparable<Person>{

	
	private int age;
	private String name;
	private int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	//Id comparator
	@Override
	public int compareTo(Person o) {
		
		return Integer.compare(getId(), o.getId());
	}
	
	//Age comparator method
	public static int compareAge(Person a , Person b) {
		
		return Integer.compare(a.getAge(), b.getAge());
	}
	
	//Name comparator method
	public static int compareName(Person a , Person b) {
	
		return a.getName().compareToIgnoreCase(b.getName());
	}
	
	//Id comparator method
	public static int compareId(Person a, Person b) {
		return Integer.compare(a.getId(), b.getId());
	}
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", id=" + id + "]";
	}


	
}
