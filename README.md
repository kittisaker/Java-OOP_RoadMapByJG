# Java-OOP_RoadMapByJG : Chapter 11 Composition in Java with Example

## Composition in Java with Perfect Example
In this example, we'll model a Library class that contains Book objects. This demonstrates a clear composition relationship where a library is composed of multiple books:

```java
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        System.out.println("books in the library : ");
        for (Book book : books) {
            book.displayInfo();
            System.out.println("-------------------------------");
        }
    }
}
```

```java
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
```

---