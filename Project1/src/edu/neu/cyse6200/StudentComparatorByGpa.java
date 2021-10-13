package edu.neu.cyse6200;

import java.util.Comparator;

public class StudentComparatorByGpa implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Double.compare(o1.getGpa(), o2.getGpa());
	}

}
