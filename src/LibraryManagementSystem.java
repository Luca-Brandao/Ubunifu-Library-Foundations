// Task 3 - Input and Output     

import java.util.Scanner;

// Defines the class LibraryManagementSystem
public class LibraryManagementSystem {
    private Book[] booksInLibrary = new Book[10]; //Maximum of 10 books
    private int bookCount = 10;  

    //Constructor to initialize the library with the following African books books
    public LibraryManagementSystem() {
        booksInLibrary[0] = new Book("So Long a Letter", "Mariama Bâ", "978-2-7071-1023-9", true);
        booksInLibrary[1] = new Book("Season of Migration to the North", "Tayeb Salih", "978-1-8476-7144-4", true);
        booksInLibrary[2] = new Book("Things Fall Apart", "Chinua Achebe", "978-0-3163-0739-4", true);
        booksInLibrary[3] = new Book("Nervous Conditions", "Tsitsi Dangarembga", "978-0-9547-0565-2", true);
        booksInLibrary[4] = new Book("Graceland", "Chris Abani", "978-0-3745-3060-1", true);
        booksInLibrary[5] = new Book("Stay with Me", "Ayọ̀bámi Adébáyọ̀", "978-1-1019-9015-0", true);
        booksInLibrary[6] = new Book("The Shadow of Imana", "Veronique Tadjo", "978-0-8573-5463-4", true);
        booksInLibrary[7] = new Book("An Orchestra of Minorities", "Chigozie Obioma", "978-0-3165-5843-8", true);
        booksInLibrary[8] = new Book("The Old Drift", "Namwali Serpell", "978-1-1019-4783-1", true);
        booksInLibrary[9] = new Book("Homegoing", "Yaa Gyasi", "978-1-1019-4892-0", true);
    }
    
    //Task 4 - Control Flow and Conditional Statements

    //Method that can add a new book to the library
    public void addBook(String title, String author, String ISBN, boolean isAvailable) {
        // Checks for duplicate ISBN codes
        if (bookCount < 10) { //Checks if the library has space for a new book
            for (int i = 0; i < bookCount; i++) {
                // If the ISBN already exists in the library, print a error message
                if (booksInLibrary[i].getISBN().equals(ISBN)) {
                    System.out.println("Book with ISBN " + ISBN + " already listed in Library.");
                    return;
                }
            }
            booksInLibrary[bookCount] = new Book(title, author, ISBN, isAvailable);
            bookCount++; 
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is at maximum capacity, additional books can no longer be added. :(");
        }
    }

    //Method to display all books in the library as well as their details
    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println();
            System.out.println((i + 1) + ". " + booksInLibrary[i].getTitle() + " by " + booksInLibrary[i].getAuthor() + " (ISBN: " + booksInLibrary[i].getISBN() + ")");
        }
    }

    //Method to check if a book is available based on its ISBN
    public boolean isBookAvailable(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (booksInLibrary[i].getISBN().equals(ISBN)) {
                return booksInLibrary[i].isAvailable();
            }
        }
        return false;
    }

    //Method to track borrowing of a book based on its ISBN
    public void borrowBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (booksInLibrary[i].getISBN().equals(ISBN)) {
                if (booksInLibrary[i].isAvailable()) {
                    booksInLibrary[i].setAvailable(false);
                    System.out.println("You have successfully borrowed: " + booksInLibrary[i].getTitle());
                } else {
                    System.out.println("Sorry, this book is already currently being borrowed.");
                }
                return; 
            }
        }
        System.out.println("Error: Book with ISBN " + ISBN + " not found.");
    }
    
    //Method that removes a book from the library based on its ISBN
    public void removeBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (booksInLibrary[i].getISBN().equals(ISBN)) {
                System.out.println("Removing book: " + booksInLibrary[i].getTitle());
                for (int j = i; j < bookCount - 1; j++) {
                    booksInLibrary[j] = booksInLibrary[j + 1];
                }
                booksInLibrary[bookCount - 1] = null;  
                bookCount--; 
                System.out.println("Book removed.");
                return; 
            }
        }
        System.out.println("Error: Book with ISBN " + ISBN + " not found.");
    }

    //Main method that allows  the library management system to run
    public static void main(String[] args) {
    	
    	//Creates an object of the library management system
        LibraryManagementSystem library = new LibraryManagementSystem(); 
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input

        while (true) {
            //Display the options of the console based application in the console to the user
            System.out.println("\nLibrary Management System Controls:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books details");
            System.out.println("4. Borrow a book");
            System.out.println("5. Close application");
            System.out.print("Choose an option: ");
            if (!scanner.hasNextInt()) {
                if (!scanner.hasNextLine()) break;
                scanner.nextLine();
                System.out.println("Please enter a menu number.");
                continue;
            }
            int choice = scanner.nextInt(); //Reads users input
            scanner.nextLine(); //Consumes a newline

            //Processing user's choices making use of a switch statement
            switch (choice) {
                case 1:
                    System.out.println("Enter book details you want to add:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine(); //Reads users input
                    System.out.print("Author: ");
                    String author = scanner.nextLine(); //Reads users input
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine(); //Reads users input
                    System.out.print("Is the book available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean(); //Reads users input
                    library.addBook(title, author, ISBN, isAvailable); // Adds the book to the library
                    break;
                case 2:
                    System.out.print("Enter the ISBN of the book you want removed: ");
                    ISBN = scanner.nextLine(); 
                    library.removeBook(ISBN); 
                    break;
                case 3:
                    library.displayBooks(); // Displays all books in the library
                    break;
                case 4:
                    System.out.print("Enter the ISBN of the book to be borrowed: ");
                    ISBN = scanner.nextLine();
                    library.borrowBook(ISBN); 
                    break;
                case 5:
                    System.out.println("---Closing the library system---");
                    scanner.close(); //Close the scanner
                    return; //Exit the application
                default:
                    System.out.println("Error: Invalid selection, please try entering a number from 1-5.");
            }
        }
    }
}


