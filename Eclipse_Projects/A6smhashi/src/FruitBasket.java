// Sadam Hashi, smhashi, CIS 340, A6

import java.util.Scanner;

public class FruitBasket {
	
	//Creating the fields/variables for this class
	private Apple apple;
    private Banana banana;
    private String basketName;

    //Setter and getter for for the basketName variable
    public String getBasketName() 
    {
        return basketName;
    }

    public void setBasketName(String basketName) 
    {
        this.basketName = basketName;
    }

    //Creating an instance of apple and banana 
    public void makeFruits() 
    {
        this.apple = new Apple(1.5);
        this.banana = new Banana(3.5);
        this.apple.setPeelThickness(1);
        this.banana.setPeelThickness(4);
    }

    //Prompting the user and making the calculations to display to the console for the user to know what amount is left
    public void eatFruits() //This method references the banana and apple classes 
    {
        Scanner scnr = new Scanner(System.in);
        double amountToEat;

        System.out.println("		***" + basketName.toUpperCase() + "***");
        System.out.println("You have an apple and a banana in your " + basketName + " basket.");

        System.out.print("What percent of the apple would you like to eat? ");
        amountToEat = Double.parseDouble(scnr.nextLine());
        apple.eat(amountToEat);

        System.out.print("What percent of the banana would you like to eat? ");
        amountToEat = Double.parseDouble(scnr.nextLine());
        banana.eat(amountToEat);
        
        double appleAmountLeft = apple.getPercentLeft();
        double bananaAmountLeft = banana.getPercentLeft();
        String basket = this.basketName;
        
        System.out.printf("\nYou have %.2f of your apple and %.2f of your banana left in your %s basket\n", 
        		appleAmountLeft, bananaAmountLeft, basket);
        
    }
	
	
}
