//package assignment4.contractor;

/* 
 * 
 * Name: ComparatorSortOwnerID.java
 * Purpose: Sorts Contractors by Owner ID's
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

import java.util.Comparator;

public class ComparatorSortOwnerID implements Comparator<Contractor>
{

	@Override
	public int compare(Contractor o1, Contractor o2)
	{
		
		return Integer.compare(o1.getOwnerID(), o2.getOwnerID());
		
	}

}
