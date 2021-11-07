package edu.neu.cyse6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UniversityBase extends AbstractSchoolAPI{

	private List<AbstractPersonAPI> employees;
	
	private List<AbstractPersonAPI> students;
	
	public UniversityBase() {
		this.employees = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	public UniversityBase(List<AbstractPersonAPI> employees, List<AbstractPersonAPI> students) {
		this.employees = employees;
		this.students = students;
	}

	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		
		this.employees.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		
		this.students.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI employee:employees) {
			sb.append(employee.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}

	@Override
	public void showEmployees() {
		
		for(AbstractPersonAPI employee:employees) {
			System.out.println(employee.toString());
		}
		
	}

	@Override
	public String getStudentsInfo() {
		
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI student:students) {
			sb.append(student.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}

	@Override
	public void showStudents() {
		for(AbstractPersonAPI student:students) {
			System.out.println(student.toString());
		}
	}

	@Override
	public void show() {
		
		showEmployees();
		System.out.println("----");
		showStudents();
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		
		this.employees.sort(c);
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		
		this.students.sort(c);
	}

	public List<AbstractPersonAPI> getEmployees() {
		return employees;
	}

	public void setEmployees(List<AbstractPersonAPI> employees) {
		this.employees = employees;
	}

	public List<AbstractPersonAPI> getStudents() {
		return students;
	}

	public void setStudents(List<AbstractPersonAPI> students) {
		this.students = students;
	}

}
