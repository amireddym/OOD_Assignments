package edu.neu.cyse6200;

import java.util.Comparator;

public class StudentComparatorByGpa implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return Double.compare(s1.getGpa(), s2.getGpa());
	}

}
