//package assignment4.lottery;

/* 
 * 
 * Name: StoreLottery.java
 * Purpose: Represents the lottery at a store
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class StoreLottery
{
	
	/* Global fields */
	public static final Scanner keyboard = new Scanner(System.in);
	
	/* Private fields */
	private List<Customer> customerList = new ArrayList<>();
	
	/* Constructors */
	public StoreLottery() {}
	
	/* Mutators and Accessors */
	public void setCustomerList(List<Customer> customerList)
	{
		
		this.customerList = customerList;
		
	}
	
	public List<Customer> getCustomerList()
	{
		
		return this.customerList;
		
	}
	
	public int getCustomerListSize()
	{
		
		return this.customerList.size();
		
	}
	
	public Customer getCustomer(int index)
	{
		
		if (index < 0 || this.customerList.size() <= index) return null;
		return this.customerList.get(index);
		
	}
	
	/* Asks user to give a file with customer names */
	public void addCustomers() throws IOException
	{
		
		String fileName = null;
		File file = null;
		Scanner inFile = null;
		
		/* Try to open a file */
		for (;;)
		{
		
			System.out.printf("What is the name of your input file of names and IDs: ");
			fileName = keyboard.nextLine();
			
			file = new File(fileName);
			
			if (!file.exists())
			{
				
				System.out.printf("The file does not exist. Please try again...\n\n");
				continue;
				
			}
			
			inFile = new Scanner(file);
				
			if (inFile.hasNext()) break;
			
			System.out.printf("The file is empty, please try again...\n\n");
			inFile.close();
			
		}
		
		String name;
		int id;
		Customer tmpCustomer = null;
		
		while (inFile.hasNext())
		{
			
			name = inFile.next();
			id = inFile.nextInt();
			
			tmpCustomer = new Customer(name, id);
			
			if (customerList.contains(tmpCustomer))
			{
				
				System.out.printf("The customer %s is a duplicate.\n", tmpCustomer);
				
			}
			
			this.customerList.add(tmpCustomer);
			
		}
		
		Collections.sort(customerList, new CustomerSortingComparator());
		
		try
		{
			
			this.printUnduplicatedList();
		
		} catch (IOException e) {}
		
		this.pickWinner();
		
	}
	
	/* Writes to a file a list of entered customers (without repeats) */
	public void printUnduplicatedList() throws IOException
	{
		
		String fileName = null;
		File file = null;
		PrintWriter outputFile = null;
		
		System.out.printf("What is the name of your output file for the names: ");
		fileName = keyboard.nextLine();
		
		file = new File(fileName);
		outputFile = new PrintWriter(file);
		
		Iterator<Customer> iter = this.getCustomerList().iterator();
		Customer prev = iter.next(), curr = iter.next();
		
		while (iter.hasNext())
		{
			
			if (!prev.equals(curr))
			{
				
				outputFile.printf("%s\n", curr);
				
			}
			
			prev = curr;
			curr = iter.next();
			
		}
		
		outputFile.close();
		keyboard.close();
		
	}
	
	/* Prints out the Winning customer */
	public void pickWinner()
	{
		
		Random randy = new Random();		
		Customer winner = this.getCustomer(randy.nextInt(this.getCustomerListSize()));

		System.out.printf("The winner and Manager for a Day is %s\n", winner);
		
	}
	
}