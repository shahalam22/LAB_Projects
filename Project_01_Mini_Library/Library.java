import java.util.Arrays;

public class Library {
    private Book[] books;
    private Students[] students;

    public Library(int numOfBooks, int numOfStudents) {
        this.books = new Book[numOfBooks];
        this.students = new Students[numOfStudents];
    }

    void addBook(Book book) {
        int i = 0;
        for(; i<this.books.length; i++){
            if(this.books[i]==book){
                this.books[i].setNumCopies(this.books[i].getNumCopies()+1);
                return;
            }
            if(this.books[i]==null){
                break;
            }
        }
        if(i==this.books.length){
            System.out.println("Sorry! you can't add more books. Increase facilities first.");
            return;
        }
        this.books[i] = book;
    }

    void addStudent(Students student) {
        int i = 0;
        for(; i<this.students.length; i++){
            if(this.students[i]==null){
                break;
            }
        }
        this.students[i] = student;
    }

    void displayBooks() {
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i]==null){
                return;
            }
            System.out.println("Book no: " + (i + 1));
            System.out.println("Book's name is: " + this.books[i].getTitle() + ".");
            System.out.println("Book's author is: " + this.books[i].getAuthor() + ".");
            System.out.println("Book's ISBN code is: " + this.books[i].getISBN() + ".");
            System.out.println("Numbers of copies left " + this.books[i].getNumCopies() + " here.");
            System.out.println();
        }
    }

    Book findBook(String title){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].getTitle()==title){
                this.books[i].display();
                return books[i];
            }
        }
        System.out.println("Sorry! there is no books named "+title+".");
        return null;
    }

    void borrowBook(String title, Students student){
        int k = findBookInt(title);

        //checking weather same student taking same book twice or not.
        Book[] tempBooks = student.getBorrowedBooks();
        for(int i=0; i<tempBooks.length; i++){
            if(tempBooks[i]==null) break;
            else if(tempBooks[i].getTitle()==title){
                System.out.println("You can't borrow same book twice.");
                return;
            }
        }

        if(books[k].getNumCopies() == 0) {
            System.out.println("There is no book named " + books[k].getTitle());
            return;
        }

        student.borrowBook(books[k]);
        this.addStudent(student);
        this.books[k].borrow();
        System.out.println(title+" has been borrowed by "+student.getName());
    }

    void returnBook(String title, Students student){
        int k = findBookInt(title);
        int flag=0, j=0;
        for(; j<this.students.length; j++){
            if(this.students[j]==student){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("There is no student named "+student.getName()+" borrowed "+title+".");
            return;
        }

        for(; j<this.students.length-1; j++){
            this.students[j] = this.students[j+1];
        }

        student.returnBook(books[k]);
        this.books[k].returnBook();
        System.out.println(title+" has been returned by "+student.getName());
    }

    int findBookInt(String title){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].getTitle()==title){
                return i;
            }
        }
        return 0;
    }

    void displayStudents() {
        System.out.println("Here is the list of students who have borrowed books from library.");
        for (int i = 0; i < this.students.length; i++) {
            if(this.students[i]==null) return;
            System.out.println("Student no: " + (i + 1));
            System.out.println("Student's name is: " + this.students[i].getName() + ".");
            System.out.println("Student's ID is: " + this.students[i].getID() + ".");
            System.out.println();
        }
    }
}