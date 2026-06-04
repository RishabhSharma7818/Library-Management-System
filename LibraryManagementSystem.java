package LibraryManagementSystem;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

     // Dummy Books
        library.addBook(new Book(1, "Java Basics", "ABC Publications"));
        library.addBook(new Book(2, "OOP Concepts", "XYZ Publications"));
        library.addBook(new Book(3, "Data Structures in Java", "N. Sharma"));
        library.addBook(new Book(4, "Algorithms Made Easy", "Narang"));
        library.addBook(new Book(5, "Design Patterns", "E. Gamma"));
        library.addBook(new Book(6, "Database Systems", "Silberschatz"));

        // Dummy Users
        library.addUser(new User(101, "Rishabh"));
        library.addUser(new User(102, "Ketan"));
        library.addUser(new User(103, "Radhika"));
        library.addUser(new User(104, "Shivam"));


        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> library.showUsers();
                case 3 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    library.issueBook(id);
                }
                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    library.returnBook(id);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

