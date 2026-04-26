package LibraryManagement;
import java.util.*;
public class Student extends User{
    private static final int maxBooks =3;
    Student(String name,String id){
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
            System.out.println("Student can only Borrow upto 3 books");
        }
    }
}
