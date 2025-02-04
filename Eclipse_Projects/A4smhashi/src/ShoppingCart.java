// Sadam Hashi, smhashi, CIS 340, A4

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		
		//Creating header using format specifiers and a temporary variable
		String temp = "";
		System.out.printf("%-25sShopping Cart\n", temp);
		System.out.println("\nThis program maintains a list of products (name, category, price). it will"
				+ "calculate average dollars spend per category for you.\n");
		//Declaring array variables
		String[] productName;
		String[] productCategory;
		double[] productPrice;
		
		//Initializing the array variables 
		productName = new String[5];
		productCategory = new String[5];
		productPrice = new double[5];
		
		//Declaring scanner object
		Scanner scnr = new Scanner(System.in);
		
		//Declaring and Initializing variables for each category 
		int counterGr = 0, counterTe = 0, counterOf = 0, counterOt = 0;
		double totalGrocery = 0, totalTech = 0, totalOffice = 0, totalOther = 0;
		double averageGrocery = 0, averageTech = 0, averageOffice = 0, averageOther = 0;
		
        for (int i = 0; i < productName.length; i++) {
            System.out.print("Enter product name: ");
            productName[i] = scnr.nextLine();

            System.out.print("Enter product category (Tech/Grocery/Office/Other): ");
            productCategory[i] = scnr.nextLine().toUpperCase();  
            System.out.print("Enter product price: ");
            productPrice[i] = Double.parseDouble(scnr.nextLine());

            System.out.println();
        }

        // Calculation for each category for loop
        for (int i = 0; i < productCategory.length; i++) {
            switch (productCategory[i]) {
                case "TECH":
                    totalTech += productPrice[i];
                    counterTe++;
                    break;
                case "GROCERY":
                    totalGrocery += productPrice[i];
                    counterGr++;
                    break;
                case "OFFICE":
                    totalOffice += productPrice[i];
                    counterOf++;
                    break;
                default:
                    totalOther += productPrice[i];
                    counterOt++;
                    break;
            }
        }

        // Calculation of averages
        if (counterTe > 0) {
            averageTech = totalTech / counterTe;
        }
        if (counterGr > 0) {
            averageGrocery = totalGrocery / counterGr;
        }
        if (counterOf > 0) {
            averageOffice = totalOffice / counterOf;
        }
        if (counterOt > 0) {
            averageOther = totalOther / counterOt;
        }

        // Output for each category
        System.out.println("\nTECH PRODUCTS"); //Displaying tech products
        boolean techF = false;
        for (int i = 0; i < productCategory.length; i++) 
        {
            if ("TECH".equals(productCategory[i]))
            {
                System.out.printf("%s \n", productName[i]);
                techF = true;
            }
        }
        if (techF) 
        {
            System.out.printf("Average dollars spent: $%.2f%n", averageTech);
        } 
        else 
        {
            System.out.println("No products in this category.");
        }
        //Displaying grocery products
        System.out.println("\nGROCERY PRODUCTS");
        boolean groceryF = false;
        for (int i = 0; i < productCategory.length; i++) 
        {
            if ("GROCERY".equals(productCategory[i])) 
            {
                System.out.printf("%s \n", productName[i]);
                groceryF = true;
            }
        }
        if (groceryF) 
        {
            System.out.printf("Average dollars spent: $%.2f%n", averageGrocery);
        } 
        else 
        {
            System.out.println("No products in this category.");
        }
        //Displaying office products
        System.out.println("\nOFFICE PRODUCTS");
        boolean officeF = false;
        for (int i = 0; i < productCategory.length; i++) 
        {
            if ("OFFICE".equals(productCategory[i])) 
            {
                System.out.printf("%s \n", productName[i]);
                officeF = true;
            }
        }
        if (officeF) 
        {
            System.out.printf("Average dollars spent: $%.2f%n", averageOffice);
        } 
        else 
        {
            System.out.println("No products in this category.");
        }
        //Displaying other products
        System.out.println("\nOTHER PRODUCTS");
        boolean found = false;
        for (int i = 0; i < productCategory.length; i++) 
        {
            if (!"TECH".equals(productCategory[i]) && !"GROCERY".equals(productCategory[i]) && !"OFFICE".equals(productCategory[i])) {
                System.out.printf("%s \n", productName[i]);
                found = true;
            }
        }
        if (found) {
            System.out.printf("Average dollars spent: $%.2f%n", averageOther);
        } else {
            System.out.println("No products in this category.");
        };
        //Asking user to enter to exit the program
	    System.out.println("\nPress Enter to Exit... ");
	    scnr.nextLine();

	    // Closing scanner
	     scnr.close();
	}

}
