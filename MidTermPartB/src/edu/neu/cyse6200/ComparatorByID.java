package edu.neu.cyse6200;

import java.util.Comparator;

public class ComparatorByID  implements Comparator<AbstractPersonAPI>{

	@Override
	public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		
		return Integer.compare(o1.getId(), o2.getId());
	}

	
}
