package edu.neu.cyse6200;

import java.util.Collections;

public class NortheasternU extends UniversityBase{

		
	public static void demo() {
		
		AbstractPersonAPI student1 = new Student(2, "raja", "singh", 21, 3.67);
		AbstractPersonAPI student2 = new Student(1, "manoj", "reddy", 24, 3.74);
		AbstractPersonAPI student3 = new Student(3, "shashank", "pragada", 23, 3.57);
		
		AbstractPersonAPI  employee1 = new Employee(13, "daniel", "peters", 34, 1230.50);
		AbstractPersonAPI  employee2 = new Employee(10, "stalin", "singh", 33, 1220.57);
		AbstractPersonAPI  employee3 = new Employee(12, "guna", "shekar", 30, 1130.56);
		
		UniversityBase universityBase = new NortheasternU();
		
		universityBase.addStudent(student1);
		universityBase.addStudent(student2);
		universityBase.addStudent(student3);
		
		universityBase.addEmployee(employee1);
		universityBase.addEmployee(employee2);
		universityBase.addEmployee(employee3);
		
		System.out.println("----------Displaying Intial Status-------------");
		universityBase.show();
		System.out.println("---------After Employees Sorted By ID---------------");
				
		universityBase.sortEmployees(new ComparatorByID());
		universityBase.show();
		System.out.println("--------After Employees Sorted By FirstName----------------");

		
		universityBase.sortEmployees(new ComparatorByFirstName());
		universityBase.show();
		System.out.println("--------After Employees Sorted By LastName----------------");

		universityBase.sortEmployees(new ComparatorByLastName());
		universityBase.show();
		System.out.println("---------After Employees Sorted By Age---------------");

		universityBase.sortEmployees(new ComparatorByAge());
		universityBase.show();
		System.out.println("--------After Employees Sorted By Wage (Natural Order)----------------");

		universityBase.getEmployees().sort(null);
		universityBase.show();
		System.out.println("------------------------");
		
		// Sorting for Students
		
		universityBase.sortStudents(new ComparatorByID());
		System.out.println("---------After Students Sorted By ID---------------");
		universityBase.show();
		
		universityBase.sortStudents(new ComparatorByFirstName());
		System.out.println("---------After Students Sorted By FirstName---------------");
		universityBase.show();
		
		universityBase.sortStudents(new ComparatorByLastName());
		System.out.println("-----------After Students Sorted By LastName-------------");
		universityBase.show();
		
		universityBase.sortStudents(new ComparatorByAge());
		System.out.println("---------After Students Sorted By Age---------------");
		universityBase.show();
		
		universityBase.sortStudents(null);
		System.out.println("-------After Students Sorted By Gpa (Natural Order)-----------------");
		universityBase.show();
		
		
	}
	
}
