package OOP_basics.this_static_and_final;

class Book {
    static String libraryName = "City Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBookDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN101");
        Book book2 = new Book("Data Structures", "Mark Allen", "ISBN102");

        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }

        System.out.println();

        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }

        System.out.println();
        Book.displayLibraryName();
    }
}