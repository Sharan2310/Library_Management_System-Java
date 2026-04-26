package LibraryManagement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean flag = true;
        // FIX: create one Library instance and use it throughout
        Library library = new Library();
        System.out.println("Welcome to the Library Management System");
        do {
            System.out.println("Please choose a valid Option:");
            System.out.println("1. Add Book\n2. view Books\n3. Add User\n4. Issue book\n5. Return book\n6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1 -> library.addBook();
                case 2 -> library.viewBooks();
                case 3 -> library.addUser();
                // FIX: call instance methods, not the empty static ones
                case 4 -> library.issueBook();
                case 5 -> library.returnBook();
                case 6 -> {
                    flag = false;
                    System.out.println("Thank you");
                }
                default -> System.out.println("Invalid Choice");
            }
        } while(flag);
        sc.close();
    }
}