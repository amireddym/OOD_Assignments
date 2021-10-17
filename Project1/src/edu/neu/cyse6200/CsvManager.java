package edu.neu.cyse6200;

import java.util.List;

public class CsvManager {
	
	
	public static void demo() {
		
		List<Person> studentsList = Student.getStudentsData();
		
		//Writing Students Data to student.txt file
		FileUtil.writeDataToFile(studentsList, "src/edu/neu/cyse6200/students.txt");
		
		List<Person> teacherList = Teacher.getTeachersList();
		
		//Writing Teachers Data to teachers.txt file
		FileUtil.writeDataToFile(teacherList, "src/edu/neu/cyse6200/teacher.txt");
		
		//Creating student objects from csv student.txt file
		Student.createObjects(FileUtil.readDataFromFile("src/edu/neu/cyse6200/students.txt"));
		
		System.out.println();
		
		//Creating teacher objects from csv teacher.txt file
		Teacher.createObjects(FileUtil.readDataFromFile("src/edu/neu/cyse6200/teacher.txt"));
		
		Student student =  new Student();
		student.sortStudentsData();
		
	}

}
