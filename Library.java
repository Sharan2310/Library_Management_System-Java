package LibraryManagement;
import java.util.*;
class Library {
    // FIX: non-static fields so they aren't reset on every new Library()
    private List<Book> books;
    private List<User> users;

    Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name : ");
        String bookName = sc.nextLine();
        System.out.print("Enter the book id : ");
        int id = sc.nextInt();
        Book b = new Book(bookName, id);
        books.add(b);
        System.out.println("Book added successfully.");
    }

    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("There is no books in the library");
            return;
        }
        System.out.println("The books in the library are:\n----------------------------------------");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Total Books : " + books.size());
        System.out.println("----------------------------------------");
    }

    void addUser() {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("Enter type of user (1.For Student/2.Teacher/3.Exit) : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student name : ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Student id : ");
                    String sid = sc.nextLine();
                    User s = new Student(sname, sid);
                    users.add(s);
                    System.out.println("Student added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter Teacher name : ");
                    String tname = sc.nextLine();
                    System.out.print("Enter Teacher id : ");
                    String tid = sc.nextLine();
                    User t = new Teacher(tname, tid);
                    users.add(t);
                    System.out.println("Teacher added successfully.");
                }
                case 3 -> flag = false;
                default -> System.out.println("Invalid choice");
            }
        } while (flag);
    }

    // FIX: fully implemented - lets user select a user and book from the lists
    void issueBook() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library");
            return;
        }
        if (users.isEmpty()) {
            System.out.println("There are no users registered");
            return;
        }

        Scanner sc = new Scanner(System.in);

        // Select user
        System.out.println("Select a user:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).name);
        }
        int uChoice = sc.nextInt() - 1;
        sc.nextLine();
        if (uChoice < 0 || uChoice >= users.size()) {
            System.out.println("Invalid user selection.");
            return;
        }
        User user = users.get(uChoice);

        // Select book
        System.out.println("Select a book:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
        int bChoice = sc.nextInt() - 1;
        sc.nextLine();
        if (bChoice < 0 || bChoice >= books.size()) {
            System.out.println("Invalid book selection.");
            return;
        }

        user.borrowBook(books.get(bChoice));
        books.remove(bChoice);
    }

    // FIX: fully implemented - lets user select a user and book to return
    void returnBook() {
        if (users.isEmpty()) {
            System.out.println("There are no users registered");
            return;
        }

        Scanner sc = new Scanner(System.in);

        // Select user
        System.out.println("Select a user:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).name);
        }
        int uChoice = sc.nextInt() - 1;
        sc.nextLine();
        if (uChoice < 0 || uChoice >= users.size()) {
            System.out.println("Invalid user selection.");
            return;
        }
        User user = users.get(uChoice);

        if (user.borrowedBooks.isEmpty()) {
            System.out.println(user.name + " has no borrowed books.");
            return;
        }

        // Select book from user's borrowed list
        System.out.println("Select a book to return:");
        for (int i = 0; i < user.borrowedBooks.size(); i++) {
            System.out.println((i + 1) + ". " + user.borrowedBooks.get(i));
        }
        int bChoice = sc.nextInt() - 1;
        sc.nextLine();
        if (bChoice < 0 || bChoice >= user.borrowedBooks.size()) {
            System.out.println("Invalid book selection.");
            return;
        }

        user.returnBook(user.borrowedBooks.get(bChoice));
        System.out.println("Book returned successfully.");
    }
}