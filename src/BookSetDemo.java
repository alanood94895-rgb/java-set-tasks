import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> books = new HashSet<>();

        // Add at least 5 book titles
        books.add("Harry Potter");
        books.add("The Hobbit");
        books.add("To Kill a Mockingbird");
        books.add("Animals");
        books.add("The Alchemist");

        // Display all book titles
        System.out.println("Book titles:");
        System.out.println(books);

        // Try to add a duplicate book title
        books.add("Animals"); // duplicate

        // Display set after attempting duplicate
        System.out.println(books);

        // Check if a book title exists
        System.out.println("The Hobbit exists:"+ books.contains ("The Hobbit"));

        // Remove a book title
        books.remove("Harry Potter");
        System.out.println(books);

        // Display total number of book titles
        System.out.println("Total number of books: " + books.size());

        // Clear all book titles
        books.clear();
        System.out.println(books);

        // Confirm set is empty
        System.out.println("Final size of set: " + books.size());
    }
}
