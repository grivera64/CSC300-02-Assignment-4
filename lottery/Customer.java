package assignment4.lottery;

/* 
 * 
 * Name: Customer.java
 * Purpose: Represents a Customer in the lottery
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

public class Customer
{
	
	private String name;
	private int idNumber;
	
	public Customer(String name, int idNumber)
	{
	
		this.setName(name);
		this.setIdNumber(idNumber);
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
	public void setIdNumber(int idNumber)
	{
		
		this.idNumber = idNumber;
		
	}
	
	public int getIdNumber()
	{
		
		return this.idNumber;
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
		if (!(obj instanceof Customer))
		{
			
			return false;
			
		}
		
		Customer tmpCustomer = ((Customer) obj);
		
		return this.getName().equals(tmpCustomer.getName()) &&
				this.getIdNumber() == tmpCustomer.getIdNumber();
		
	}
	
	@Override
	public String toString()
	{
		
		return String.format("%s ID %d", this.getName(), this.getIdNumber());
		
	}
	
}