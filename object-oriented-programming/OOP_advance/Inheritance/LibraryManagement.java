package OOP_advance.Inheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Author author1 = new Author(
                "The Great Gatsby",
                1925,
                "F. Scott Fitzgerald",
                "American novelist and short story writer."
        );

        author1.displayInfo();
    }
}
