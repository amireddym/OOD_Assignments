package edu.neu.cyse6200;

public class Employee extends Person{

	private double employeeWage;
	
	public Employee(int id, String firstName, String lastName, int age, double employeeWage) {
		super(id, firstName, lastName, age);
		this.employeeWage=employeeWage;
	}

	public double getEmployeeWage() {
		return employeeWage;
	}

	public void setEmployeeWage(double employeeWage) {
		this.employeeWage = employeeWage;
	}

	@Override
	public String toString() {
		return "Employee [employeeWage=" + employeeWage + ", Id=" + getId() + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + ", Age=" + getAge() + "]";
	}
	
	@Override
	public int compareTo(Person o1) {
		
		Employee e = (Employee) o1;
		return Double.compare(getEmployeeWage(), e.getEmployeeWage());
	}
	
}
