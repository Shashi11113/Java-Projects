// Sadam Hashi, smhashi, CIS 340, E3
import java.util.Scanner;

public class GPACalc {

	public static void main(String[] args) {
		
		//Initializing Variables to store values
		String grade = "";
		int credits = 0;
		int totalCredits = 0;
		int totalPoints = 0;
		double gpa = 0;
		System.out.println("This program will calculate GPAs based on course grades");
		
		Scanner scnr = new Scanner(System.in);
		
		//Using a for loop to get four courses and credits
		for (int i = 1; i <= 4; i++)
		{
			//Prompting user for a letter grade
			System.out.printf("Enter grade: ");
			grade = scnr.nextLine();
			
			//Prompting the user for a course credit amount
			System.out.printf("Enter number of credits for grade: ");
			credits = Integer.parseInt(scnr.nextLine());
			
			//Converting grades to grade points
			int gradePoints;
			switch (grade.toUpperCase()) 
			{
				case "A":
					gradePoints = 4;
					break;
				case "B":
					gradePoints = 3;
					break;
				case "C":
					gradePoints = 2;
					break;
				case "D":
					gradePoints = 1;
					break;
				default:
					gradePoints = 0;
					break;
			}
			
			//Calculating the accumulated points
			totalPoints += credits * gradePoints;
			totalCredits = totalCredits + credits;
			System.out.println();
		}
		
		//Calculating the actual gpa
		gpa = (double)totalPoints/totalCredits;
		
		//Displaying the gpa value in the console 
		System.out.printf("The GPA is %.2f", gpa);
		
		//Closing scanner
		scnr.close();
		
	}

}
