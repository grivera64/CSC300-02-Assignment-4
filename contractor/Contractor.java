//package assignment4.contractor;

/* 
 * 
 * Name: Contractor.java
 * Purpose: Represents a Contractor
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

public class Contractor
{
	
	/* Private Fields */
	private String name = "";
	private String location = "";
	private int ownerID;
	
	/* Constructors */
	public Contractor() {}
	
	public Contractor(String name, String location, int ownerID)
	{
		
		this.setName(name);
		this.setLocation(location);
		this.setOwnerID(ownerID);
		
	}
	
	/* Mutators and Accessors */
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
	public void setLocation(String location)
	{
		
		this.location = location;
		
	}
	
	public String getLocation()
	{
		
		return this.location;
		
	}
	
	public void setOwnerID(int ownerID)
	{
		
		this.ownerID = ownerID;
		
	}
	
	public int getOwnerID()
	{
		
		return this.ownerID;
		
	}
	
	/* Return the Contractor's Name, location and ID when printed */
	@Override
	public String toString()
	{
		
		return String.format("%s %s %d",
				this.getName(), this.getLocation(), this.getOwnerID());
		
	}

}
