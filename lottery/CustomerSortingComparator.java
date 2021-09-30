//package assignment4.lottery;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<Customer>
{
	
	@Override
	public int compare(Customer a, Customer b)
	{
		
		int val1 = a.getIdNumber(),
			val2 = b.getIdNumber();
		
		if (val1 == val2)
		{
			
			return 0;
			
		}
		else if (val1 > val2)
		{
			
			return 1;
			
		}
		else
		{
			
			return -1;
			
		}
		
	}

}
