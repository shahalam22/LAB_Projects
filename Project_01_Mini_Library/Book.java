import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int numCopies;

    public Book(String title, String author, String ISBN, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numCopies = numCopies;
    }

    //getters
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getNumCopies() {
        return numCopies;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    void display(){
        System.out.println("Book's name is: "+this.title+".");
        System.out.println("Book's author is: "+this.author+".");
        System.out.println("Book's ISBN code is: "+this.ISBN+".");
        System.out.println("Numbers of copies left: "+this.numCopies+".");
    }

    void borrow(){
        this.numCopies = this.numCopies-1;
    }

    void returnBook(){
        this.numCopies = this.numCopies+1;
    }
}