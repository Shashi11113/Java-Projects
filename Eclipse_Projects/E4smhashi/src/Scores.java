// Sadam Hashi, smhashi, CIS 340, E4

import java.util.Scanner;


public class Scores {

	public static void main(String[] args) {
		
		//Creating header by utilizing format specifiers and temporary variable
		String temp = "";
		System.out.printf("%-25sStudent Grade System\n", temp);
		System.out.println("\nThis program will store students grades and look them up for you.\n");
		
		//Declaring array variables
		int [] scores;
		String [] names;
		
		//Initialize the arrays
		names = new String[5];
		scores = new int [5];
		
		//Header for for guiding the user to enter student names
		System.out.println("********************************");
		System.out.print("Enter names. One name per line.\n");
		System.out.print("********************************\n");
		
		Scanner scnr = new Scanner(System.in);
		
		//Using for loop to store names into the names array
		for(int i = 0; i < names.length; i++)
		{
			System.out.print("Enter name: ");
			names[i] = scnr.nextLine();
		}
		
		//Header for for guiding the user to enter student scores
		System.out.println("\n********************************");
		System.out.print("Enter scores. One score per line.\n");
		System.out.print("********************************\n");
		
		//Using for loop to store scores into the scores array
		for(int i = 0; i < scores.length; i++)
		{
			System.out.printf("Enter score for %s: ", names[i]);
			scores[i] = Integer.parseInt(scnr.nextLine());
		}
		
		//Looking up the stored values
		System.out.println("\n\n You entered the following data:\n");
		System.out.println("Name\t\tScore");
		for (int i = 0; i < names.length; i++)
		{
			System.out.printf("%-10s %10d\n", names[i], scores[i]);
		}
		
		scnr.close();
	}

}
