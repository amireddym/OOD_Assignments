package edu.neu.cyse6200;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<AbstractPersonAPI>{

	@Override
	public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
		
		return Double.compare(o1.getAge(), o2.getAge());
	}

}
