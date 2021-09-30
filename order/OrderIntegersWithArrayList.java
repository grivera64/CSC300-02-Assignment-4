package assignment4.order;

/* 
 * 
 * Name: OrderIntegersWithArrayList
 * Purpose: Tests Sorting via Interfaces
 * Author: grivera64
 * Date: 10/2/2021
 * 
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;

public class OrderIntegersWithArrayList
{
	
	public static void main(String[] args) throws IOException
	{
		
		/* Allowing input from the keyboard */
		Scanner keyboard = new Scanner(System.in);
		
		/* Local Variables */
		String fileName = null;
		File file = null;
		Scanner inFile = null;
		List <Integer> integerList = new ArrayList<>();
		
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
		
		int curr, index;
		
		/* Read all of the int values */	
		while (inFile.hasNext())
		{
			
			curr = inFile.nextInt();
				
			for (index = 0; index < integerList.size(); index++)
			{
				
				if (integerList.get(index) >= curr) break;
				
			}
				
			integerList.add(index, curr);
			
		}
		
		
		/* Print each of the items in the list */
		Iterator<Integer> iter = integerList.iterator();
		
		while (iter.hasNext())
		{
			
			System.out.printf("%d\n", iter.next());
			
		}
		
		
		/* Close everything */
		inFile.close();
		
	}
	
}