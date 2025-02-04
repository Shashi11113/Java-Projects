// Sadam Hashi, smhashi, CIS 340, A5

import java.util.Scanner;


public class GradeSystem {

	public static int[] scoreArray = new int[5];
	public static String[] nameArray = new String[5];
	
	public static void main(String[] args) {
		
		//Formating the headers
		String temp = "";
		System.out.printf("%-25sStudent Grade System\n", temp);
		
		System.out.println("\nThis program will store student grades and look them up for you.\n");
		
		//Header for prompting the user to enter names
		System.out.print("*********************************\n");
		System.out.println("Enter the names of 5 students");
		System.out.println("*********************************\n");
		
		//Method to populate the name's array in order to store
		populateNameArray();
		
		//Header for prompting the user to enter scores 
		System.out.print("*********************************\n");
		System.out.println("Enter scores. One score per line.");
		System.out.println("*********************************\n");
		
		//Method used to populate the scores and store the user inputs
		populateScoreArray();
		
		//Creating a new object scanner
		Scanner scnr = new Scanner(System.in);
		
		//Prompting the user to enter the student they want
		System.out.print("Enter name of student whose score you want to find: ");
		String nameOfStudent = scnr.nextLine();
		
		//Storing the returned integer(index) from the findStudentPosition method into a new integer 
		int studentPosition = findStudentPosition(nameOfStudent);
		
		//Using conditions to display the correct student score and name	
		if (studentPosition == -1)
		{
			System.out.println("\nI'm sorry. There is no student by that name.\n");
		}
		else
		{
			System.out.printf("%s's score is %d\n\n", nameArray[studentPosition], scoreArray[studentPosition]);	
		}
		
		//Prompting the user to exist the program	
		System.out.print("Press Enter key to exist...");
		scnr.nextLine();
		
		//Closing scanner object
		scnr.close();
	}
	
	//Populating the nameArray with user input 
	public static void populateNameArray()
	{
		Scanner scnr = new Scanner(System.in);
		
		for (int i = 0; i < nameArray.length; i++)
		{
			nameArray[i] = scnr.nextLine();
		}
		System.out.println();
		
	}
	
	//Populating the scoreArray with user input
	public static void populateScoreArray()
	{
		Scanner scnr = new Scanner(System.in);
		for (int i = 0; i < scoreArray.length; i++)
		{
			System.out.printf("Enter score for %s: ", nameArray[i]);
			scoreArray[i] = Integer.parseInt(scnr.nextLine());
		}
		System.out.println();
		
	}
	
	//finding the index of the student name using nameArray
	public static Integer findStudentPosition(String nameOfStudent)
	{
		
		for (int i = 0; i < nameArray.length; i++)
		{
			if (nameArray[i].equalsIgnoreCase(nameOfStudent))
			{
				return i;
				
			}
		}
		return -1;

	}
	
}
