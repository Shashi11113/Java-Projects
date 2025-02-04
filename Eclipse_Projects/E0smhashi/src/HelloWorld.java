// Sadam Hashi, smhashi, CIS 340, E0
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Initializing a string variable 
		String userName = "";
		
		//Prints "Hello World" into the console 
		System.out.println("Hello World!");
		
		//Prompts an input from the user
		System.out.print("What's your name? ");
		
		Scanner inputDevice = new Scanner(System.in);
		
		//Stores the skipped the skipped input and passes it to userName variable
		userName = inputDevice.nextLine();
		
		//Prints out a message after prompting for the users name
		System.out.println("Hi " + userName + ". See you around!");
		
		inputDevice.close();
	}

}
