// Sadam Hashi, smhashi, CIS 340, E5
import java.util.ArrayList;

public class Methods {

	//Declaring an ArrayList variable
	private static ArrayList<Integer> listOfNumbers;
	
	
	public static void main(String[] args) {
		
		//Method 1: to print Hello in the console
		printGreetings();
		System.out.println("*** Testing product and return values ***");
		
		//Method 2: to find the products of two hard coded numbers
		int result = product(5, 2);
		System.out.printf("The product of 5 and 2 is %d\n\n", result);
		
		//Method 3: Concatenating two hard coded strings
		System.out.println("*** Testing concatenate and nested method calls ***");
		System.out.printf("The return value is \"%s\" \n\n", concatenate("Hello", "World"));
		
		//Populating/adding values to the declared ArrayList
		addTestData();
		
		//Looping through constructed ArrayList using enhanced loops by returning a boolean value
		System.out.println("*** Testing ArrayList Search ***");
		boolean numberFound = false;
		numberFound = listContains(4);
		System.out.println("Testing if the number 4 is present in the ArrayList....");
		if (numberFound == true)
		{
			System.out.println("numberList contains the number 4\n");
		}
		else
		{
			System.out.println("numberList does not contain the number 4\n");
		}
		
		//Running the same code again, but with a different value 
		numberFound = false;
		numberFound = listContains(56);
		System.out.println("Testing if the number 56 is present in the ArrayList....");
		if (numberFound == true)
		{
			System.out.println("numberList contains the number 56\n");
		}
		else
		{
			System.out.println("numberList does not contain the nummber 56\n");
		}
		
		System.out.println("*** Testing Divide and return values ***");
		double division = divide(7,6);
		System.out.printf("The result of dividing 7 and 6 is %.4f\n", division);
		
		
		
	}
	
	//HelloWorld printing
	private static void printGreetings()
	{
		System.out.println("Hello\n");
	}
	
	//Returning the products of two parameters
	private static Integer product(int param1, int param2)
	{
		
		return param1 * param2;
	}
	
	//Concatenating two given strings together, returns a string
	private static String concatenate(String param1, String param2)
	{
		return param1+param2;
	}
	
	//Adding the values the declared ArrayList
	private static void addTestData()
	{
		listOfNumbers = new ArrayList<>();
		listOfNumbers.add(23);
		listOfNumbers.add(34);
		listOfNumbers.add(45);
		listOfNumbers.add(56);
	}
	
	//Returning a boolean value by looping through the constructed ArrayList
	private static boolean listContains(int param1)
	{
		boolean found = false;
		for (int number : listOfNumbers)
		{
			if (number == param1)
			{
				found = true;
				break;
			}
			
		}
		return found;
	}
	
	//Returns the division of numbers(double)
	private static double divide(int param1, int param2)
	{
		double quotient;
		quotient = (double) param1/param2;
		return quotient;
	}

}
