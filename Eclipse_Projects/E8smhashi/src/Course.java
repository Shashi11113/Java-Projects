// Sadam Hashi, smhashi, CIS 340, E8


public class Course {

	//Creating fields for this new class
	private String coursePrefix;
	private int courseNumber; 
	private static String collegeName;
	private double classAverage;
	
	//Creating the setters and getters to access the private fields for client classes
	public void displayMessage()
	{
		System.out.printf("Welcome to the grade book for %s %d!\n",coursePrefix,  courseNumber);
	}
	
	public String getCoursePrefix()
	{
		return coursePrefix;
	}
	public void setCoursePrefix(String coursePrefix)
	{
		this.coursePrefix = coursePrefix;
	}
	
	public int getCourseNumber()
	{
		return courseNumber;
	}
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber;
	}
	
	public static String getCollegeName()
	{
		return collegeName;
	}
	public static void setCollegeName(String collegeName)
	{
		Course.collegeName = collegeName;
	}
	
	public double getClassAverage()
	{
		return classAverage;
	}
	
	
}
