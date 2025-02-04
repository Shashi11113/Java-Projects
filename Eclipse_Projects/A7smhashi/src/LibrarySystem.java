// Sadam Hashi, smhashi, CIS 340, A7

import java.util.Scanner;
import java.util.ArrayList;


public class LibrarySystem {

	
	//Creating an object references of an ArrayList data type
	private ArrayList<Book> books = new ArrayList<>();
	
	public static void main(String[] args) {
		//Instantiating and invoking a new object in this class in order to reference non-static type methods
		LibrarySystem NewlibrarySystem = new LibrarySystem();
		NewlibrarySystem.loadLibrarySystem();
		
	}
	//Displaying the header
	public void displayHeader()
	{
		System.out.println("			 New Liberary System\n");
	}
	//This method prompts the user and Instantiates an object, stores the data in the Book class fields
	public void addBook()
	{
		Scanner scnr = new Scanner(System.in);
		String bookTitle;
		int publicationYear;
		System.out.print("\nEnter Book title: ");
		bookTitle = scnr.nextLine();
		System.out.print("Enter Book Year: ");
		publicationYear = Integer.parseInt(scnr.nextLine());
		
		
		books.add(new Book(bookTitle, publicationYear));
		
		System.out.printf("Title '%s' added to the library.", bookTitle);
	}
	//This method displays the data entered by the user by printing in chronological order use for each loop
	public void displayBookList()
	{
		displayHeader();
		System.out.printf("Title 								Year\n");
		for(Book book: books)
		{
			System.out.printf("%-63s %d\n", book.getbookTitle() , book.getpublicationYear());
		}
	}
	//This method prompts the user on how many books they want to insert, loops through it and invokes the addBook method to store data
	public void loadLibrarySystem()
	{
		Scanner scnr = new Scanner(System.in);
		int temp;
		displayHeader();
		System.out.println();
		System.out.print("How many new books do you want to add to the Library? ");
		temp = Integer.parseInt(scnr.nextLine());
		for (int i = 0; i < temp; i++)
		{
			addBook();
		}
		//Asks the user to continue by pressing enter after the loop and data collection is complete to display the book list
		System.out.println("\n\nAdding books complete. Press enter to continue.\n\n\n\n");
		scnr.nextLine();
		displayBookList();
	}
	
}
