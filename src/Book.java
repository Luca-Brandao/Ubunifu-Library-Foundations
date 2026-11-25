//Task 2 - Basic Operations part1 

// Defines the class Book
public class Book {
    
    // Private variables to store the title, author, ISBN, and availability attributes of the book
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    // Constructor to initialize the Book object with attributes title, author, ISBN, and isAvailable 
    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;            // Assigns the title of the book
        this.author = author;          // Assigns the author of the book
        this.ISBN = ISBN;              // Assigns the ISBN of the book
        this.isAvailable = isAvailable; // Sets the availability of a book
    }

    // Getter method to retrieve the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the author of the book
    public String getAuthor() {
        return author;
    }

    // Getter method to retrieve the ISBN of the book
    public String getISBN() {
        return ISBN;
    }

    // Getter method to check if the book is available (true = available, false = unavailable)
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter method to update the availability of the books
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
