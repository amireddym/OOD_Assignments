package edu.neu.cyse6200;

import java.util.Comparator;

public class Student extends Person implements Comparator<Student>{

	private int studentId;
	
	private double gpa;
	
	public Student(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			int studentId, double gpa) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.studentId = studentId;
		this.gpa = gpa;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}
