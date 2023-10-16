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