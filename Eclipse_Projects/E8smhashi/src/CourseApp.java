// Sadam Hashi, smhashi, CIS 340, E8

import java.util.Scanner;


public class CourseApp {

	public static void main(String[] args) {
		
		//Creating two object references
		Course courseOne;
		Course courseTwo;
		
		//Instantiating both object references 
		courseOne = new Course();
		courseTwo = new Course();
		
		//New scanner object to prompt the user
		Scanner scnr = new Scanner(System.in);
		
		//Prompting the user for input and storing the inputs in the courseOne object by accessing methods + fields from the Course class 
		System.out.print("Please enter the first course prefix: ");
		courseOne.setCoursePrefix(scnr.nextLine());
		System.out.print("Please enter the course number: ");
		courseOne.setCourseNumber(Integer.parseInt(scnr.nextLine()));
		Course.setCollegeName("ASU");
		System.out.println("\nA new Course has been created for " + courseOne.getCoursePrefix() +" "+ 
		courseOne.getCourseNumber() + " at " + courseOne.getCollegeName()+".");
		courseOne.displayMessage();
		
		
		//Doing the same thing as the previous step except with few minor changes in the actual code
		System.out.print("\nPlease enter the second course prefix: ");
		courseTwo.setCoursePrefix(scnr.nextLine());
		System.out.print("Please enter the course number: ");
		courseTwo.setCourseNumber(Integer.parseInt(scnr.nextLine()));
		Course.setCollegeName("ASU");
		String School = Course.getCollegeName();
		String coursePrefix = courseTwo.getCoursePrefix();
		int courseNumber = courseTwo.getCourseNumber();
		System.out.printf("\nA new Course has been created for %s %d at %s.\n", coursePrefix, courseNumber, School);
		courseTwo.displayMessage();
		
		scnr.close();
		
	}

}
