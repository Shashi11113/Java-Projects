// Sadam Hashi, smhashi, CIS 340, E10

import java.util.Scanner;

public class CalorieCalculator {
	//Creating a static object for all methods to call
	static Scanner scnr = new Scanner(System.in);
	//Creating constants that the class methods can use to do calculations
	static final double CALORIE_COEFFICIENT = 0.167;
	static final double POUNDKG_COEFFICIENT = 0.453592;
	
	public static void main(String[] args) {
		//Declaring variables to store method return values
		int weight, minutes, seconds; 
		double totalTime, kilos, caloriesBurnt;
		//Displays the header of the program and its functions
        System.out.println("			Running Calorie Calculator\n\n");
        System.out.println("This application can calculate calories based on running mileage.\n");
        //Invoking the readInteger method by passing a string
        weight = readInteger("Enter runner weight (lbs): ");
        minutes = readInteger("Enter minutes run: ");
        seconds = readInteger("Enter seconds run: ");
        
        //Calculates the total minutes and converting pounds to kilograms
        totalTime = (minutes + (seconds / 60.00));
        kilos = poundsToKilos(weight);
        
        //Calling the caloriesSpentRunning method an passing arguments to do the calories calculation
        caloriesBurnt = caloriesSpentRunning(kilos, totalTime);
        //Displays the result
        System.out.printf("\nIf you run %d minutes and %d seconds at 6mph, \nthe calories burned are approximately %.2f\n", minutes, 
        		seconds, caloriesBurnt);
        
	}
	//Converts pounds to kilograms
	public static double poundsToKilos(double pounds)
	{
		pounds *= POUNDKG_COEFFICIENT;
		return pounds;
	}
	//Calculates calories burnt
	public static double caloriesSpentRunning(double kilograms, double minutes)
	{
		return kilograms * minutes * CALORIE_COEFFICIENT;
	}
	//Does exceptions handling using try/catch, prompts the user for input  
	public static int readInteger(String displayString)
	{
		//Initializes local variables
		int numberOfErrors = 0;
		int theNumber = 0;
		Boolean repeatInput = false;
		//Using do while loop for exceptions handling
		do 
		{
			try
			{
				System.out.print(displayString);
				theNumber = Integer.parseInt(scnr.nextLine());
				repeatInput = false;
			}
			catch(NumberFormatException err)
			{
				if(numberOfErrors >= 3)
				{
					System.out.println("\nEntered incorrect data. Press a key to exist.\n");
					System.exit(0);
				}
				
				System.out.println("\nInput must be a valid integer. Try again.\n");
				repeatInput = true;
				numberOfErrors++;
				
			}
		} while(repeatInput == true);
		
		return theNumber;
	}
	
	

}
