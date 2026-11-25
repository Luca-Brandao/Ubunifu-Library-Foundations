//Task 2 - Basic Operations  part 3 Testing classes Book and LibraryUser and creating 10 Book objects and 10 User objects

//Defines the Main class that contains the main method for testing the Book and LibraryUser classes
public class Main {
    public static void main(String[] args) {
        
        //Creates an array to hold books in the library. With a 10 book maximum capacity 
        Book[] booksInLibrary = new Book[10];
        
        //Initializes each book with the attributes/data title, author, ISBN, and isAvailbe
        booksInLibrary[0] = new Book("So Long a Letter", "Mariama Bâ","978-2-7071-1023-9", true);
        booksInLibrary[1] = new Book("Season of Migration to the North", "Tayeb Salih", "978-1-8476-7144-4", true);
        booksInLibrary[2] = new Book("Things Fall Apart", "Chinua Achebe", "978-0-3163-0739-4", true);
        booksInLibrary[3] = new Book("Nervous Conditions", "Tsitsi Dangarembga", "978-0-9547-0565-2", true);
        booksInLibrary[4] = new Book("Graceland", "Chris Abani", "978-0-3745-3060-1", true);
        booksInLibrary[5] = new Book("Stay with Me", "Ayọ̀bámi Adébáyọ̀", "978-1-1019-9015-0",true);
        booksInLibrary[6] = new Book("The Shadow of Imana", "Veronique Tadjo","978-0-8573-5463-4", true);
        booksInLibrary[7] = new Book("An Orchestra of Minorities", "Chigozie Obioma", "978-0-3165-5843-8", true);
        booksInLibrary[8] = new Book("The Old Drift", "Namwali Serpell", "978-1-1019-4783-1", true);
        booksInLibrary[9] = new Book("Homegoing", "Yaa Gyasi", "978-1-1019-4892-0",true);

        //Creates an array to hold library users. With a 10 user maximum capacity
        LibraryUser[] libraryUsers = new LibraryUser[10];
        
        //Initializes each library user with the attributes/data name and userID also the attribute maxBooks
        libraryUsers[0] = new LibraryUser("Demo Member One", "UID001", 10);
        libraryUsers[1] = new LibraryUser("Demo Member Two", "UID002", 10);
        libraryUsers[2] = new LibraryUser("Demo Member Three", "UID003", 10);
        libraryUsers[3] = new LibraryUser("Demo Member Four", "UID004", 10);
        libraryUsers[4] = new LibraryUser("Demo Member Five", "UID005", 10);
        libraryUsers[5] = new LibraryUser("Demo Member Six", "UID006", 10);
        libraryUsers[6] = new LibraryUser("Demo Member Seven", "UID007", 10);
        libraryUsers[7] = new LibraryUser("Demo Member Eight", "UID0008", 10);
        libraryUsers[8] = new LibraryUser("Demo Member Nine", "UID009", 10);
        libraryUsers[9] = new LibraryUser("Demo Member Ten", "UID010", 10);

        //Prints the heading for testing for Task 2 on a newline
        System.out.println("Testing for Task 2:");
        
        //Prints a blank line
        System.out.println();
        
        //Prints text indicating the list of books borrowed by users
        System.out.println("List of books borrowed by users: ");
        System.out.println("------------------------------------------------------------------------------");
        
        //Testing for the getter and setter methods within the Book and LibraryUser classes by creating instances of users borrowing books
        libraryUsers[0].borrowBook(booksInLibrary[1]); //Demo Member One borrows "Season of Migration to the North"
        libraryUsers[1].borrowBook(booksInLibrary[3]); //Demo Member Two borrows "Nervous Conditions"
        libraryUsers[2].borrowBook(booksInLibrary[2]); //Demo Member Three borrows "Things Fall Apart"
        libraryUsers[3].borrowBook(booksInLibrary[7]); //Demo Member Four borrows "An Orchestra of Minorities"
        libraryUsers[4].borrowBook(booksInLibrary[2]); //Demo Member Five tries to borrow "Things Fall Apart" but it is unavailable
        libraryUsers[5].borrowBook(booksInLibrary[5]); //Demo Member Six borrows "Stay with Me"
        libraryUsers[6].borrowBook(booksInLibrary[8]); //Demo Member Seven borrows "The Old Drift"
        libraryUsers[6].borrowBook(booksInLibrary[9]); //Demo Member Seven borrows "Homegoing"
        libraryUsers[6].borrowBook(booksInLibrary[4]); //Demo Member Seven borrows "Graceland"
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        //Prints a list of all the books in the library as well as their details (title, author, ISBN, availability)
        System.out.println("List of the books within the Library and their details:");
        for (int i = 0; i < booksInLibrary.length; i++) {
            System.out.println();
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Book " + (i + 1) + ": " + booksInLibrary[i].getTitle() + " by " + booksInLibrary[i].getAuthor());
            System.out.println("ISBN: " + booksInLibrary[i].getISBN());
            System.out.println("Available: " + booksInLibrary[i].isAvailable());
            System.out.println("------------------------------------------------------------------------------");
            System.out.println();
        }
        
        //Prints two blank lines
        System.out.println();
        System.out.println();
        
        //Prints the list of library users, their details, and a list of books that they are currently borrowing
        System.out.println("List of Library users and their details as well as the books they are currently borrowing:");
        for (int i = 0; i < libraryUsers.length; i++) {
            System.out.println();
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Library User Name " + (i + 1) + ": " + libraryUsers[i].getName());
            System.out.println("UserID: " + libraryUsers[i].getUserID());
            System.out.print("List of books that are currently being borrowed by the user: ");
            
            //If the user has not borrowed any books from the library it prints a line saying no books have been borrowed by the user
            if (libraryUsers[i].getBorrowedCount() == 0) {
                System.out.println();
                System.out.println("User has no borrowed books currently.");
            } else {
                //Prints a list of the titles of the books the user is currently borrowing
                System.out.println();
                for (int j = 0; j < libraryUsers[i].getBorrowedCount(); j++) {
                    System.out.println(" > " + libraryUsers[i].getBorrowedBooks()[j].getTitle());
                }
            }
            System.out.println("------------------------------------------------------------------------------");
            System.out.println();
        }
    }
}
