package edu.neu.cyse6200;

public class Student extends Person{

	private double gpa;
	
	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.gpa=gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", Id=" + getId() + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + ", Age=" + getAge() + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		
		Student st = (Student) o;
		return Double.compare(getGpa(), st.getGpa());
	}
	
}
