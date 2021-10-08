package edu.neu.cyse6200;

public class Student extends Person {

	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(int age, String name, int id,double gpa) {
		super(age, name, id);
		this.gpa = gpa;
	}
	
	
	// Does runtime polymorphism
	@Override
	public int compareTo(Person o) {
		
		Student s = (Student) o;
		return Double.compare(getGpa(), s.getGpa());
	}
	
	//Gpa comparator
	public static int compareGpa(Student a, Student b) {
		
		return Double.compare(a.getGpa(), a.getGpa());
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", Age=" + getAge() + ", Name=" + getName() + ", Id=" + getId()
				+ "]" + "\n";
	}


	
	
}
