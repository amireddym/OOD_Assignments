package edu.neu.cyse6200;

import java.util.Comparator;

public class ComparatorByFirstName implements Comparator<AbstractPersonAPI>{

	@Override
	public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
