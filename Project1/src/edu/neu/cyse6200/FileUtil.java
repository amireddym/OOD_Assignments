package edu.neu.cyse6200;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

	
	public static void writeDataToFile(List<Person> persons, String fileName) {
		
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
	
	public static List<String> readDataFromFile(String fileName){
		
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
