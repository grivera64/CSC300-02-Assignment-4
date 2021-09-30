package assignment4.contractor;

public class Contractor
{
	
	private String name = "";
	private String location = "";
	private int ownerID;
	
	public Contractor() {}
	
	public Contractor(String name, String location, int ownerID)
	{
		
		this.setName(name);
		this.setLocation(location);
		this.setOwnerID(ownerID);
		
	}
	
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
	
	@Override
	public String toString()
	{
		
		return String.format("%s %s %d",
				this.getName(), this.getLocation(), this.getOwnerID());
		
	}

}
