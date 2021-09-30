//package assignment4.contractor;

/* 
 * 
 * Name: ComparatorSortName.java
 * Purpose: Sorts Contractors by Name
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

import java.util.Comparator;

public class ComparatorSortName implements Comparator<Contractor>
{

	@Override
	public int compare(Contractor o1, Contractor o2)
	{
		
		return o1.getName().compareTo(o2.getName());
		
	}

}
