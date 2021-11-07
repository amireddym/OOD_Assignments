package edu.neu.cyse6200;

public class Driver {
	
	public static void main(String[] args) {
		
		NortheasternU.demo();
		
//		----------Displaying Intial Status-------------
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		---------After Employees Sorted By ID---------------
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		--------After Employees Sorted By FirstName----------------		
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		--------After Employees Sorted By LastName----------------
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		---------After Employees Sorted By Age---------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		--------After Employees Sorted By Wage (Natural Order)----------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		------------------------
//		---------After Students Sorted By ID---------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		---------After Students Sorted By FirstName---------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		-----------After Students Sorted By LastName-------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		---------After Students Sorted By Age---------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]
//		-------After Students Sorted By Gpa (Natural Order)-----------------
//		Employee [employeeWage=1130.56, Id=12, FirstName=guna, LastName=shekar, Age=30]
//		Employee [employeeWage=1220.57, Id=10, FirstName=stalin, LastName=singh, Age=33]
//		Employee [employeeWage=1230.5, Id=13, FirstName=daniel, LastName=peters, Age=34]
//		----
//		Student [gpa=3.57, Id=3, FirstName=shashank, LastName=pragada, Age=23]
//		Student [gpa=3.67, Id=2, FirstName=raja, LastName=singh, Age=21]
//		Student [gpa=3.74, Id=1, FirstName=manoj, LastName=reddy, Age=24]

	}

}
