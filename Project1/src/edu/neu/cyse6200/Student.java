package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private int studentId;

	private double gpa;

	public Student(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			int studentId, double gpa) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	public Student() {
		super();
	}

	public static void createObjects(List<String> objectsData) {

		List<Student> students = new ArrayList<>();

		for (String obj : objectsData) {

			String[] objectData = obj.split(",");
			int id = 0;
			int age = 0;
			int studentId = 0;
			double gpa =0;
			
			try {
				id = Integer.parseInt(objectData[0]);
			}catch (Exception e) {
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
			 studentId = Integer.parseInt(objectData[6]);
			} catch (Exception e){
				System.out.println("Unable to Parse studentId from csv");
				System.out.println(e.getMessage());
			}
			
			try {
			  gpa = Double.parseDouble(objectData[7]);
			} catch (Exception e){
				System.out.println("Unable to Parse Gpa from csv");
				System.out.println(e.getMessage());
			}
			
			
			students.add(new Student(id, age, firstName, lastName, parentFirstName, parentLastName, studentId, gpa));
		}

		System.out.println("Printing Students List data");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public static List<Person> getStudentsData() {

		List<Person> persons = new ArrayList<>();
		persons.add(new Student(13, 24, "manoj", "reddy", "venkat", "amireddy", 123, 3.39));
		persons.add(new Student(16, 27, "daniel", "peters", "rutherford", "rick", 132, 3.13));
		persons.add(new Student(11, 20, "ruthivk", "verma", "karthik", "reddy", 111, 3.50));
		persons.add(new Student(19, 25, "ramana", "sastry", "satish", "acharya", 199, 3.97));

		return persons;
	}
	
	public void sortStudentsData() {
		
		List<Person> studentsData = getStudentsData();
		studentsData.add(new Student(15, 30, "shashank","Siripragada", "adesham","sirigunda", 124,3.90));
		
		
		
		System.out.println();
		System.out.println("Students List before Sorting");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);
		
		//Sorting Students based on ID
		studentsData.sort(new StudentComparatorById());
		System.out.println();
		System.out.println("Students List after Sorting by Id");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);
		
		//Sorting Students based on Student ID
		studentsData.sort(new StudentComparatorByStudetId());
		System.out.println();
		System.out.println("Students List after Sorting by StudentId");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);
		
		//Sorting Students based on LastName
		studentsData.sort(new StudentComparatorByLastName());
		System.out.println();
		System.out.println("Students List after Sorting by LastName");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);
		
		//Sorting Students based on FirstName
		studentsData.sort(new StudentComparatorByFirstName());
		System.out.println();
		System.out.println("Students List after Sorting by FirstName");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);

		//Sorting Students based on GPA
		studentsData.sort(new StudentComparatorByGpa());
		System.out.println();
		System.out.println("Students List after Sorting by Gpa");
		System.out.println("Id,Age,FirstName,LastName,ParentFirstName,ParentLastName,StudentId,Gpa");
		studentsData.forEach(System.out::println);

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
	public String toString() {
		return  getId() + "," + getAge() + "," + getFirstName() + "," + getLastName() + ","
				+ getParentFirstName() + "," + getParentLastName() + "," + studentId + "," + gpa ;
	}


}
