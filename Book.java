package LibraryManagement;
import java.util.*;
public class Book {
    private String bookName;
    private int id;
    private boolean isAvailable;

    Book(String bookName, int id) {
        this.bookName = bookName;
        this.id = id;
        this.isAvailable = true;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book Name : "+this.bookName+", Book Id : "+this.id;
    }

    void borrowBook(String bookName) {
        if(isAvailable) {
            isAvailable = false;
        }else{
            System.out.println("Book Not Available");;
        }
    }
    void returnBook() {
        isAvailable = true;
    }
}
