// Sadam Hashi, smhashi, CIS 340, MP1

import java.util.Scanner;

public class MP1 {

	//Making the scanner object static in order to for the all methods to call and instantiate it
	static Scanner scnr = new Scanner(System.in);
	//Creating static variables so all the methods can reference them since they all operate the same
    static String[] studentNames;
    static double[][] quizScores;
    static int numberOfStudents = 3;
    static int numberOfQuizzes;
	
	public static void main(String[] args) 
	{
		//Calling the collectData in the main method to execute the program
		collectData();
		//Using switch statements to display the menu and handle user input
		while (true) 
        {
            System.out.println("		Menu");
            System.out.println("1. Class Average");
            System.out.println("2. Student Average");
            System.out.println("3. Quiz Average");
            System.out.print("\nEnter choice number, or x to exit: ");
            String choice = scnr.nextLine();

            switch (choice) 
            {
                case "1":
                    calculateClassAverage();
                    break;
                case "2":
                    calculateStudentAverage();
                    break;
                case "3":
                    calculateQuizAverage();
                    break;
                case "x":
                    return;
            }
        }
	}
	
	// Creating method to collect and initialize data
    public static void collectData() 
    {
        System.out.print("How many scores per student? ");
        numberOfQuizzes = scnr.nextInt();
        scnr.nextLine(); 
        System.out.println();

        studentNames = new String[numberOfStudents];
        quizScores = new double[numberOfStudents][numberOfQuizzes];

        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scnr.nextLine();
            System.out.println();
            System.out.println("Entering scores for " + studentNames[i].toUpperCase());
            
            for (int j = 0; j < numberOfQuizzes; j++) 
            {
                System.out.print("Quiz " + (j + 1) + ": ");
                quizScores[i][j] = scnr.nextDouble();
            }
            scnr.nextLine(); 
            System.out.println();
        }
       
    }
    
    //Creating a method to calculate the class average
    public static void calculateClassAverage() 
    {
        double total = 0;
        int count = 0;

        for (int i = 0; i < numberOfStudents; i++) 
        {
            for (int j = 0; j < numberOfQuizzes; j++) 
            {
                total += quizScores[i][j];
                count++;
            }
        }

        double average = total / count;
        System.out.printf("Class average for all quizzes is %.2f\n", average);
        System.out.print("\nPress Enter to continue..."); //Continues the program
        scnr.nextLine();
    }

    //Creating a method to calculate the student average
    public static void calculateStudentAverage() 
    {
        System.out.print("\nCalculating average by student.\n");
        System.out.print("\nEnter student name: ");
        String studentName = scnr.nextLine();
        
        
        int studentIndex = -1;
        for (int i = 0; i < numberOfStudents; i++) 
        {
            if (studentNames[i].equalsIgnoreCase(studentName)) 
            {
                studentIndex = i;
                break;
            }
        }

        if (studentIndex == -1) 
        {
            System.out.println("Student not found.");
        } 
        else 
        {
        	//Prints the scores of the current student
        	System.out.print(studentNames[studentIndex] + "'s scores are: ");
        	for (int j = 0; j < numberOfQuizzes; j++) 
        	{
                System.out.printf("%.2f ", quizScores[studentIndex][j]);
            }
            System.out.println(); 
        	
            double total = 0;
            for (int j = 0; j < numberOfQuizzes; j++) 
            {
                total += quizScores[studentIndex][j];
            }
            double average = total / numberOfQuizzes;
            System.out.printf("%s's average is %.2f\n", studentNames[studentIndex], average);
        }

        System.out.print("\nPress Enter to continue...\n"); //Continues the program
        scnr.nextLine();
    }

    // Creating a method to calculate the quiz average
    public static void calculateQuizAverage() 
    {
        System.out.print("\nCalculating average by Quiz Number");
        System.out.print("\nEnter Quiz number: ");
        int quizNumber = scnr.nextInt();
        scnr.nextLine(); 

        if (quizNumber < 1 || quizNumber > numberOfQuizzes) 
        {
            System.out.println("Invalid quiz number.");
        } 
        else 
        {
            double total = 0;
            for (int i = 0; i < numberOfStudents; i++) 
            {
                total += quizScores[i][quizNumber - 1];
            }
            double average = total / numberOfStudents;
            System.out.printf("\nQuiz %d average is %.2f\n", quizNumber, average);
        }

        System.out.print("Press Enter to continue...\n");//Continues the program
        scnr.nextLine();
    }


}
