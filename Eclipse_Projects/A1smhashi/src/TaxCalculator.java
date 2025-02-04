// Sadam Hashi, smhashi, CIS 340, A1

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
		// Declare and initialize variables
		double grossIncome = 0;
		double deduction = 0;
		double netIncome = 0;
		double federalTax  = 0;
		double stateTax = 0;
		double finalTax = 0;
		String filingStatus = "";
		
		//Creating new scanner object
		Scanner scnr = new Scanner(System.in);
		
		//Creating a temporary to format
		String temp = " ";
		System.out.printf("%-15sIncome Tax Calculator\n\n", temp);
		System.out.print("This program will calculate your income tax.\n\n");
			
		System.out.print("What is your gross income? ");
		grossIncome = Double.parseDouble(scnr.nextLine());
		
		//Listing of filing status codes 
        System.out.println("\nFILING STATUS.");
        System.out.println("Single - SG");
        System.out.println("Married Joint - MJ");
        System.out.println("Married Separately - MS");
        System.out.println("Head of Household - HH");
		
        //Prompting user to enter given letter codes
        System.out.print("\nEnter the two letter code corresponding with your status: ");
        filingStatus = scnr.nextLine();
        
        //Calculating deductions based on filing status
        switch(filingStatus.toUpperCase())
        {
        	case "SG":
        		deduction = 5950;
        		break;
        	case "MJ":
        		deduction = 11900;
        		break;
        	case "MS":
        		deduction = 5950;
        		break;
        	case "HH":
        		deduction = 8700;
        		break;
        	default:
        		deduction = 0;
        		break;     
        }
        
        //Calculating net income
        netIncome = grossIncome - deduction;
        
        //Calculating federal tax based on net income by using if statements
        if (netIncome < 30000)
        {
        	federalTax = netIncome * 0.00;
        }
        else if (netIncome >= 30000 && netIncome < 60000)
        {
            federalTax = netIncome * 0.10;
        }
        else if (netIncome >= 60000 && netIncome < 100000) 
        {
            federalTax = netIncome * 0.20;
        } 
        else if (netIncome >= 100000 && netIncome < 250000) 
        {
            federalTax = netIncome * 0.30;
        } 
        else if (netIncome >= 250000) 
        {
            federalTax = netIncome * 0.40;
        }
        
        //Calculating state tax
        stateTax = netIncome * 0.025;
        //Calculating total tax liability
        finalTax = federalTax + stateTax; 
        
        //Displaying income and final total tax value
        System.out.printf("\nYour stated income was %.2f\n", grossIncome);
        System.out.printf("Your final tax liability is %.2f", finalTax);
        
        //Closing scanner
        scnr.close();
	}

}
