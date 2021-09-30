package assignment4.contractor;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.File;

public class ContractorSortTest
{
	
	public static void main(String[] args) throws IOException
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		/* Local Variables */
		String fileName = null;
		File file = null;
		Scanner inFile = null;
		
		/* Try to open a file */
		for (;;)
		{
		
			System.out.printf("Please enter a file name: ");
			fileName = keyboard.nextLine();
			
			file = new File(fileName);
			
			if (!file.exists())
			{
				
				System.out.printf("The file does not exist. Please try again...\n\n");
				continue;
				
			}
			
			inFile = new Scanner(file);
				
			if (inFile.hasNext()) 
			{
				
				keyboard.close();
				break;
				
			}
			
			System.out.printf("The file is empty, please try again...\n\n");
			inFile.close();
			
		}
		
		/* Local Variables */
		List<Contractor> alContractor = new ArrayList<>();
		String name, location;
		int id;
		
		while (inFile.hasNext())
		{
			
			name = inFile.next();
			location = inFile.next();
			id = inFile.nextInt();
			
			alContractor.add(new Contractor(name, location, id));
			
		}
		
		inFile.close();
		
		System.out.printf("List Sorted By Contractor Name\n");
		Collections.sort(alContractor, new ComparatorSortName());
		
		for (Contractor c : alContractor)
		{
			
			System.out.printf("%s\n", c);
			
		}
		
		System.out.printf("\n");
		
		System.out.printf("List Sorted By Location\n");
		Collections.sort(alContractor, new ComparatorSortLocation());
		
		for (Contractor c : alContractor)
		{
			
			System.out.printf("%s\n", c);
			
		}
		
		System.out.printf("\n");
		
		System.out.printf("List Sorted By OwnerID\n");
		Collections.sort(alContractor, new ComparatorSortOwnerID());
		
		for (Contractor c : alContractor)
		{
			
			System.out.printf("%s\n", c);
			
		}
		
		System.out.printf("\n");
		
		System.out.printf("List MultiSorted\n");
		Collections.sort(alContractor, new ComparatorMultiSort());
		
		for (Contractor c : alContractor)
		{
			
			System.out.printf("%s\n", c);
			
		}
		
	}

}
