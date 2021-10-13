package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
	
	
	private List<Student> studentRoster = new ArrayList<>();
	
	private List<Person> personRoster = new ArrayList<>();;

	
	public static void  demo() {
		
		School school = new School();
		
		Student s1 = new Student(10,"ravi", 1,3.51);
		Student s2 = new Student(12,"raju", 2,3.67);
		Student s3 = new Student(13,"sruthi", 5,3.31);
		Student s4 = new Student(11,"manoj", 4,3.01);
		Student s5 = new Student(9,"yadav", 3,3.97);
		
		school.add(s1);
		school.add(s2);
		school.add(s3);
		school.add(s4);
		school.add(s5);

		Person p1 = new Student(5,"ram", 3,3.11);
		Person p2 = new Student(12,"krishna", 2,3.37);
		Person p3 = new Student(13,"daniel", 5,3.81);
		Person p4 = new Student(11,"peter", 4,3.71);
	    Person p5 = new Student(9,"khaled", 1,3.97);

		school.add(p1);
		school.add(p2);
		school.add(p3);
		school.add(p4);
		school.add(p5);
		
		System.out.println("--------Intial Lists Data-----------");
		
		System.out.println(school.toString());
		
		System.out.println("------------------------------------");
		
		school.sortStudentRoasterList(school);

		System.out.println("------------------------------------");
		
		school.sortPersonRoasterList(school);
		
	}
	
	private void sortStudentRoasterList(School school) {
		
		System.out.println("StudentRoster list Before Sort");
		school.getStudents().forEach(System.out::println);
		System.out.println();
		
		System.out.println("StudentRoster list Sorted By ID");
		school.getStudents().sort(Person::compareId);                      // default sort by id for studentRoster List
//		Collections.sort(school.getStudents(), new ComparatorByID());      // Comparator way of Sorting by ID
		school.getStudents().forEach(System.out::println);
		System.out.println();

		System.out.println("StudentRoster list Sorted By Age");
		school.getStudents().sort(Student::compareAge);                    // sort by Age for studentRoster List
//		Collections.sort(school.getStudents(), new ComparatorByAge());     // Comparator way of Sorting by Age
		school.getStudents().forEach(System.out::println);
		System.out.println();
		
		System.out.println("StudentRoster list Sorted By Gpa");
		Collections.sort(school.getStudents());                            // sort by Gpa for studentRoster List
		school.getStudents().forEach(System.out::println);
		System.out.println();

		System.out.println("StudentRoster list Sorted By Name");
		school.getStudents().sort(Student::compareName);                   // sort by name for studentRoster List
//		Collections.sort(school.getStudents(), new ComparatorByName());    // Comparator way of Sorting by Name
		school.getStudents().forEach(System.out::println);
		System.out.println();
	}
	
	private void sortPersonRoasterList(School school) {
		
		System.out.println("PersonRoster list Before Sort");
		school.getPersons().forEach(System.out::println);
		System.out.println();
		
		System.out.println("PersonRoster list Sorted By ID");
		school.getPersons().sort(Person::compareId);                      // Sort by id for personRoster List
//		Collections.sort(school.getPersons(), new ComparatorByID());      // Comparator way of Sorting by ID
		school.getPersons().forEach(System.out::println);
		System.out.println();
				
		System.out.println("PersonRoster list Sorted By Age");
		school.getPersons().sort(Person::compareAge);                     // Sort by age for person;
//		Collections.sort(school.getPersons(), new ComparatorByAge());     // Comparator way of Sorting by Age
		school.getPersons().forEach(System.out::println);
		System.out.println();
		
		System.out.println("PersonRoster list Sorted By Name");
		school.getPersons().sort(Person::compareName);                    // name for person
//		Collections.sort(school.getPersons(), new ComparatorByName());    // Comparator way of Sorting by Name
		school.getPersons().forEach(System.out::println);
		System.out.println();
		
		System.out.println("PersonRoster list Sorted By Gpa");
		Collections.sort(school.getPersons());                            // sort by Gpa for studentRoster List 
		school.getPersons().forEach(System.out::println);
		System.out.println();
	}
	
	public void add(Student s) {
		getStudents().add(s);
	}
	
	public void add(Person p) {
		getPersons().add(p);
	}
	

	public List<Student> getStudents() {
		return studentRoster;
	}

	public void setStudents(List<Student> students) {
		this.studentRoster = students;
	}

	public List<Person> getPersons() {
		return personRoster;
	}

	public void setPersons(List<Person> persons) {
		this.personRoster = persons;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "StudentRoster List : \n" + getStudents().toString() + "\n" +"PersonRoster List : " + getPersons().toString();
	}

}
