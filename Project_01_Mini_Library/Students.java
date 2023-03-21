import java.util.Arrays;

public class Students {
    private String name;
    private int ID;
    private Book[] borrowedBooks;

    //getters
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Students(String name, int ID, int borrowedBook) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = new Book[borrowedBook];
    }

    void display(){
        System.out.println("Student's name: "+this.name);
        System.out.println("Student's ID: "+this.ID);
        System.out.println("Student's borrowed books: ");
        for(int i=0; i<this.borrowedBooks.length; i++){
            System.out.println((i+1)+". "+this.borrowedBooks[i]);
        }
    }

    void borrowBook(Book book){
        int i = 0;
        for(; i<this.borrowedBooks.length; i++){
            if(borrowedBooks[i]==null){
                break;
            }
        }
        if(i==this.borrowedBooks.length){
            System.out.println("Sorry! you can't take any books more. To borrow new books, you have to return previous books");
            return;
        }
        this.borrowedBooks[i] = book;
    }

    void returnBook(Book book){
        int k = findbook(book);
        if(k==-1){
            System.out.println(this.getName()+" didn't borrowed any book named "+book.getTitle());
        }
        for(; k<this.borrowedBooks.length-1; k++){
            this.borrowedBooks[k]=this.borrowedBooks[k+1];
        }
    }

    int findbook(Book book){
        int k = 0;
        for(; k<this.borrowedBooks.length; k++){
            if(borrowedBooks[k]==book) return k;
        }
        return -1;
    }
}