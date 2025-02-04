// Sadam Hashi, smhashi, CIS 340, E1
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		//Initializing different variables to reference and manipulate the code
		String studentName = "";
		int score = 0;
		char grade = 'z';
		
		//Declaring a new Scanner variable to scan the keyboard for input
		Scanner scnr = new Scanner(System.in);
		
		//Displaying a message and Prompting the user for input
		System.out.println("Letter Grade Calculator\t");
		System.out.print("What's your name? ");
		
		//storing the string prompt in the studentName variable
		studentName = scnr.nextLine();
		
		System.out.printf("Enter an integer score for %s: ", studentName);
		
		//Storing the inputed integer in the score variable  
		score = scnr.nextInt();
		
		//Checking if the user input meets a certain score condition to set it for a letter grade
		if (score >= 90)
		{
			grade = 'A';
		}
		else if (score >= 80 && score < 90)
		{
			grade = 'B';
		}
		else if (score >= 70 && score < 80)
		{
			grade = 'C';
		}
		else if (score >= 60 && score < 70)
		{
			grade = 'D';
		}
		else if (score < 60)
		{
			grade = 'F';
		}
		
		//Printing the letter grade into the console
		System.out.printf("The grade for this class is %s. ", grade);
		
		//Giving the user a feedback based on their grade type
		if (grade == 'A')
		{
			System.out.print("You Passed. Awesome!\n");
			System.out.println("Keep doing what you're doing.");
		}
		else if (grade == 'B')
		{
			System.out.print("You Passed. Beautiful!\n");
			System.out.println("Keep doing what you're doing.");
		}
		else if (grade == 'C')
		{
			System.out.print("You Passed. Completed!\n");
			System.out.println("Do better next semester.");
		}
		else if (grade == 'D')
		{
			System.out.print("You failed. Done!\n");
			System.out.println("Do better next semester.");
		}
		else if (grade == 'F')
		{
			System.out.print("You failed. Forget it happened!");
			
		}
		
		//Closing the Scanner to avoid memory leaks
		scnr.close();

	}

}
