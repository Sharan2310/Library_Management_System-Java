package LibraryManagement;
import java.util.*;
abstract class User {
    protected String name;
    protected String id;
    protected List<Book> borrowedBooks;
    protected List<Book> returnedBooks;
    User(String name,String id) {
        this.name=name;
        this.id=id;
        this.borrowedBooks=new ArrayList<>();
        this.returnedBooks=new ArrayList<>();
    }

    abstract void borrowBook(Book book);

    void returnBook(Book book){
        borrowedBooks.remove(book);
        returnedBooks.add(book);
        book.returnBook();
    };
}

