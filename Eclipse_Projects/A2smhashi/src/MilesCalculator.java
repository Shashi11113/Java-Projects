// Sadam Hashi, smhashi, CIS 340, A2

import java.util.Scanner;

public class MilesCalculator {

	public static void main(String[] args) {
		
		//Creating a new scanner object
		Scanner scnr = new Scanner(System.in);
		//Initializing new variables
		String destinationCodes = "";
		int milesAwarded = 0;
		int statusOptions = 0;
		double bonusMiles = 0;
		double milesEarned = 0;
		
		//Creating a temporary to format
		String temp = " ";
        
        System.out.printf("%-20sMiles Calculator\n\n", temp);
        
        //Display destinations
        System.out.println("This program will calculate how many miles you earn on your Phoenix Air flight\n");
        System.out.println("DESTINATIONS");
        System.out.println("Los Angeles (LAX)");
        System.out.println("San Diego (SAN)");
        System.out.println("Las Vegas (LAS)\n");
        
        //Prompting the user for destination codes
        System.out.print("Enter destination airport code: ");
        destinationCodes = scnr.nextLine();
        
        //Calculating miles awarded based on the destination 
        switch(destinationCodes.toUpperCase())
        {
        	case "LAX":
        		milesAwarded = 369;
        		break;
        	case "SAN":
        		milesAwarded = 304;
        		break;
        	case "LAS":
        		milesAwarded = 255;
        		break;
        	default:
        		System.out.println("Phoenix Air does not fly to " + destinationCodes + "There will be zero miles earned.");
        		System.out.println("Press enter to quit...");
        		scnr.nextLine();
        		scnr.close();
        		return;
        }
        
        //Display status options and prompting the user for input
        System.out.println("\nSTATUS");
        System.out.println("1. Bronze");
        System.out.println("2. Silver");
        System.out.println("3. Gold");
        System.out.println("4. Platinum\n");
        System.out.print("Enter frequent flyer status option (1-4): ");
        statusOptions = scnr.nextInt();
        
        //Calculating the bonus miles the user earns based on their status
        if(statusOptions == 1)
        {
        	bonusMiles = 0.00;
        }
        if (statusOptions == 2) 
        {
        	bonusMiles = 0.25;
        } 
        else if (statusOptions == 3) 
        {
        	bonusMiles = 0.5;
        } 
        else if (statusOptions == 4) 
        {
            bonusMiles = 1;
        }
        
        //Calculating miles earned by the user
        milesEarned = milesAwarded * (1 + bonusMiles);
        
     // Display result
        System.out.printf("You will earn %.2f miles flying from Phoenix to %s.\n", milesEarned, destinationCodes);
        //Closing the scanner
        scnr.close();
	}

}
