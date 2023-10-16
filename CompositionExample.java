public class CompositionExample {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orawell");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}

// Output :
// books in the library : 
// Title : To Kill a Mockingbird
// Author : Harper Lee
// -------------------------------
// Title : 1984
// Author : George Orawell
// -------------------------------