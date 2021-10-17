package edu.neu.cyse6200;

import java.util.Comparator;

public class StudentComparatorByStudetId implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return Integer.compare(s1.getStudentId(), s2.getStudentId());
	}

}
