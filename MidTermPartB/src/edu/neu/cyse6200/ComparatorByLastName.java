package edu.neu.cyse6200;

import java.util.Comparator;

public class ComparatorByLastName implements Comparator<AbstractPersonAPI>{

	@Override
	public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		
		return o1.getLastName().compareTo(o2.getLastName());
	}

	
}
