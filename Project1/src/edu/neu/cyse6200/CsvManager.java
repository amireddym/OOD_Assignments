package edu.neu.cyse6200;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CsvManager {
	
	
	public static void demo() {
		
		List<Person> studentsList = Student.getStudentsData();
		
		//Writing Students Data to student.txt file
		writeDataToFile(studentsList, "src/edu/neu/cyse6200/students.txt");
		
		List<Person> teacherList = Teacher.getTeachersList();
		
		//Writing Teachers Data to teachers.txt file
		writeDataToFile(teacherList, "src/edu/neu/cyse6200/teacher.txt");
		
		//Creating student objects from csv student.txt file
		Student.createObjects(readDataFromFile("src/edu/neu/cyse6200/students.txt"));
		
		System.out.println();
		
		//Creating teacher objects from csv teacher.txt file
		Teacher.createObjects(readDataFromFile("src/edu/neu/cyse6200/teacher.txt"));
		
		Student student =  new Student();
		student.sortStudentsData();
		
	}
	
	
	private static void writeDataToFile(List<Person> persons, String fileName) {
		
		try {
			FileWriter fr = new FileWriter(fileName);
			
			for(Person person:persons) {
				fr.append(person.toString() + "\n");
			}
			fr.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static List<String> readDataFromFile(String fileName){
		
		List<String> objectsData = new ArrayList<>();
		
		try {

			Scanner sc = new Scanner(new FileInputStream(fileName));

			while (sc.hasNextLine()) {

				String inputLine = sc.nextLine();
				if(inputLine.isEmpty()) {
					continue;
				}
				objectsData.add(inputLine);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return objectsData;
	}

}
