package LibraryManagement;
import java.util.*;
public class Teacher extends User{
    private static final int maxBooks =5;
    Teacher(String name, String id) {
        super(name,id);
    }
    @Override
    void borrowBook(Book book) {
        if(borrowedBooks.size()<maxBooks){
            if(book.isAvailable()){
                borrowedBooks.add(book);
                book.borrowBook(book.getBookName());
                System.out.println("Book issued to "+name);
            }else{
                System.out.println("Book not available");
            }
        }else{
            System.out.println("Teacher can only Borrow upto 5 books");
        }
    }
}
