//Task 2 - Basic Operations  part 2

// Defines the class LibraryUser
public class LibraryUser {
    
	 // Private variables to store the name, userID, borrowedBooks and borrowedBookCount attributes of the users
    private String name;               
    private String userID;             
    private Book[] borrowedBooks;      
    private int borrowedBookCount;     

    // Constructor to initialize LibraryUser object with the attributes name, userID, borrowedBooks and borrowedBookCount
    public LibraryUser(String name, String userID, int maxBooks) {
        this.name = name;                           // Assigns the name to the user
        this.userID = userID;                       // Assigns the userID
        this.borrowedBooks = new Book[maxBooks];    // Initializes an array to store the borrowed books, based on maxBooks allowed
        this.borrowedBookCount = 0;                 // Initializes the count of borrowed books to 0
    }

    // Getter method to retrieve the user name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the user ID
    public String getUserID() {
        return userID;
    }

    // Getter method to retrieve the array of books borrowed by users
    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    // Getter method to retrieve the amount books borrowed by users as a integer
    public int getBorrowedCount() {
        return borrowedBookCount;
    }

    // Method to borrow a book for the user, checking whether the book is available to be borrowed and whether the user has exceeded the limit of borrowed books
    public void borrowBook(Book book) {
        if (book.isAvailable() && borrowedBookCount < borrowedBooks.length) { // Checks if the book is available and if the user has not reached the limit of borrowing books
            borrowedBooks[borrowedBookCount] = book;   // Adds the book to the borrowedBooks array
            borrowedBookCount++;                       // Increases the borrowed book count
            book.setAvailable(false);                  // Changes the book from available to unavailable
            System.out.println(name + " is now borrowing " + book.getTitle() + "!"); // Prints message indicating successful borrowing of books
        } else {
            System.out.println("Error: Cannot borrow " + book.getTitle() + " for user " + userID + " : " + name); // Prints error message if the book cannot be borrowed
        }
    }
}
