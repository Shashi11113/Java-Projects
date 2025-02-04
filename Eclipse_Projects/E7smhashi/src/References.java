// Sadam Hashi, smhashi, CIS 340, E7

import java.util.ArrayList;
import java.util.Scanner;


public class References {

	public static void main(String[] args) {

		//Formating the main header of the program
		String temp = "";
		System.out.printf("%-10s**** Passing Refereences - Reading 5 Names ****\n\n", temp);
		
		
		System.out.println("Main Method: Passing an Array, nameArray, by-value");
		
		//Initializing a new string array
		String[] nameArray = new String[5];
		
		//Calling the readStudentsNames method by passing the new initialized array
		readStudentsNames(nameArray);
		
		//Looping through the contents the user inputs and printing it into the console
		System.out.println("Main Method: The contents of nameArray are:");
		for (int i = 0; i < nameArray.length; i++)
		{
			System.out.println(nameArray[i]);
		}
		System.out.println(); //new line for better readability
		
		System.out.println("Main Method: Passing an Array, nameArray, by-value");
		
		//Creating a new ArrayList
		ArrayList<String> nameArrayList = new ArrayList<>();
		
		//Passing the new created ArrayList to the readStudentsNames method
		readStudentsNames(nameArrayList);
		System.out.println("Main Method: The contents of nameArrayList are:");
		
		//Printing the contents of the ArrayList
		for(String names: nameArrayList)
		{
			System.out.println(names);
		}
		
		
	}
	
	//Method 1:Loops through an array and asks for user input to store student names
	private static void readStudentsNames( String[] stringArray)
	{
		System.out.println("readStudentNames Method: Putting values inside stringArray parameter");
		Scanner scnr = new Scanner(System.in);
		for (int i = 0; i < stringArray.length; i++)
		{
			System.out.printf("Enter name %d: ", i + 1);
			stringArray[i] = scnr.nextLine();
			
		}
		System.out.println();
		
	}
	
	//Method 2: Looping though an ArrayList and asking the user for input to store another set of student names
	private static void readStudentsNames(ArrayList<String> stringList)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("readStudentNames Method: Putting values inside stringListparameter");
		for (int i = 1; i <= 5; i++)
		{
			System.out.printf("Enter name %d: ", i + 1);
			stringList.add(scnr.nextLine());
			
		}
		System.out.println();
		//Closing scanner object
		scnr.close();
	}

	
}
