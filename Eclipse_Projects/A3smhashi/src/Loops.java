// Sadam Hashi, smhashi, CIS 340, A3

import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
	       
        //Part 1 - for loop, odd numbers
        int oddNumbers = 1;
        System.out.println("Part 1 - Odd Numbers");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d ", oddNumbers);
            oddNumbers += 2;
        }
        System.out.println();
        
        //Part 2 - while loop, even numbers
        System.out.println("\nPart 2 - Even Numbers");
        int evenNumbers = 2;
        while (evenNumbers <= 20 )
        {
            System.out.printf("%d ", evenNumbers);
            evenNumbers += 2;
        }
        System.out.println();
        
        //Part 3 - Factorial
        System.out.println("\nPart 3 - Factorial");
        double numb = 0;
        double counter = 1;
        System.out.print("Enter a number for the factorial: ");
        numb = Double.parseDouble(scnr.nextLine());
       
        for (double i = numb; i >= 1 ; i--)
        {
            counter *= i; 
        }
        System.out.printf("The factorial is %.0f \n", counter);
       
        //Part 4 - 10 level triangle 
        System.out.println("\nPart 4 - Triangle");
        for (int i = 10; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
               
            }
           
            System.out.println();
        }
        System.out.println("\nPress Enter for next page... ");
        scnr.nextLine();
        
        //Part 5 - Average Calculator
        System.out.println("Part 5 - Average Calculator\n");
        System.out.println("This program wil ask you to enter 2 scores for 3 students\n");
        int count = 0;
        double score = 0;
        double totalScore = 0;
        double average = 0;
        for (int i = 1; i <= 3; i++)
        {
        	for (int j = 1; j <= 2; j++)
        	{
        		System.out.printf("\nStudent %d, ", i);
        		System.out.printf("score %d: ", j);
        		score = Double.parseDouble(scnr.nextLine());
        		totalScore += score;
        		count++;
        	}
        	
        }
        average = (double) totalScore/count;
        System.out.printf("\nThe average of all scores is %.2f\n", average);
        
        System.out.println("\nPress Enter for next page... ");
        scnr.nextLine();
        
        //Part 6 - Multiplication table
        System.out.println("Part 6 - Multiplication table\n");
        int total = 0;
        for (int i = 5; i <=10; i++)
        {
        	for (int j = 10; j <= 50; j+=10)
        	{
        		total = i * j;
        		System.out.printf("%d * %d = %d\n", i,j, total);
        	}
        	System.out.println();
        }
        //Closing scanner
        scnr.close();

	}

}
