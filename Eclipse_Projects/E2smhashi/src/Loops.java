// Sadam Hashi, smhashi, CIS 340, E2
import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		
		System.out.println("I can build you a line of asterisks.\n");
		
		//Initializing variables to manipulate and creating a new scanner object
		int asteriskCount = 0;
		int counter = 0;
		Scanner scnr = new Scanner(System.in);
		
		System.out.printf("How many asterisks do you want? ", asteriskCount);
		
		asteriskCount = Integer.parseInt(scnr.nextLine());
		
		System.out.println("\nPrinting a line of asterisks using a while loop");
		
		//Printing a line of asterisks using a while loop
		while (counter < asteriskCount)
		{
			System.out.print("*");
			counter++;
		//end while	
		}
		
		//Printing a line of asterisks using a for loop
		System.out.println("\n\nPrinting a line of asterisks using a for loop");
		
		for (int i = 0; i < asteriskCount; i++)
		{
			System.out.print("*");
		}
		
		//List of numbers from 1 to 5
		System.out.printf("\n\nList of numbers from 1 to %d\n", asteriskCount);	
		for (int i = 1; i <= asteriskCount; i++)
		{
			System.out.printf("%-2d", i);
		}
		
		//List of multiples of 5 from 5 to 50
		System.out.print("\n\nList of multiples of 5 from 5 to 50\n");
		for (int i = 5; i <= 50; i += 5)
		{
			System.out.printf("%d ", i);
		}
		
		//Multiplication table for 2
		System.out.print("\n\nMultiplication Table for 2\n");
		for (int i = 1; i <= 12; i++ )
		{
			final int CONSTANT_TWO = 2;
			int result = CONSTANT_TWO * i;
			System.out.printf("%d * %2d = %2d\n", CONSTANT_TWO, i, result);
			
		}
			
		//Closing scanner
		scnr.close();

	}

}
