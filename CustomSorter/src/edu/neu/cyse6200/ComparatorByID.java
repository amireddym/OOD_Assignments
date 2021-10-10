package edu.neu.cyse6200;

import java.util.Comparator;

public class ComparatorByID implements Comparator<Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
		
		
		return Integer.compare(arg0.getId(), arg1.getId());
	}

}
