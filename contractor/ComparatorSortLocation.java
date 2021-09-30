//package assignment4.contractor;

/* 
 * 
 * Name: ComparatorSortLocation.java
 * Purpose: Sorts Contractors by Location
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

import java.util.Comparator;

public class ComparatorSortLocation implements Comparator<Contractor>
{

	@Override
	public int compare(Contractor o1, Contractor o2)
	{
		
		return o1.getLocation().compareTo(o2.getLocation());
		
	}

}
