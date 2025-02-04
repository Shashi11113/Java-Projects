// Sadam Hashi, smhashi, CIS 340, A7


public class Book {
	
	//Creates the class variables
	private String bookTitle;
	private int publicationYear;
	
	//Creating the default constructor
	public Book(){}
	//Another constructor that takes arguments
	public Book(String bookTitle,int publicationYear)
	{
		this.bookTitle = bookTitle;
		setPublicationYear(publicationYear);
	}
	
	//The setter and getter methods for this class
	public String getbookTitle()
	{
		return bookTitle;
	}
	
	public void setbookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	
	public int getpublicationYear()
	{
		return publicationYear;
	}
	//This setter method makes sure bad values are handled
	public void setPublicationYear(int publicationYear)
	{
		if (publicationYear > 2024 || publicationYear < 1100)
		{
			this.publicationYear = 1900;
		}
		else
		{
			this.publicationYear = publicationYear;
		}
	}
	
}
