public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Fellowship point", "Alice elliott dark", "1200", 1);
        Book book2 = new Book("Finding me", "Viola devis", "1201", 1);
        Book book3 = new Book("ANNA", "Amy Odell", "1202", 1);

        Students student1 = new Students("Shah alam abir", 1439, 3);
        Students student2 = new Students("Abdur rahman", 1440, 3);
        Students student3 = new Students("Hasin Ahmed", 1415, 3);

        Library newLib = new Library(10,3);
        newLib.addBook(book1);
        newLib.addBook(book2);
        newLib.addBook(book3);
        newLib.addBook(book3);


//        newLib.displayBooks();
//        newLib.findBook("ANNA");
//        newLib.borrowBook("ANNA", student1);
//        newLib.returnBook("ANNA", student1);
//        newLib.borrowBook("ANNA", student1);
//        newLib.displayBooks();
//        newLib.returnBook("ANNA", student1);
//        newLib.returnBook("ANNA", student1);
//        newLib.displayStudents();

//        book1.display();
//        book1.returnBook();
//        System.out.println(book1.getNumCopies());
//        book1.borrow();
//        System.out.println(book1.getNumCopies());

    }
}