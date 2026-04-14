import java.util.HashSet;
import java.util.Set;

public class MovieSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> movies = new HashSet<>();

        // Add at least 5 movie names
        movies.add("Frozen");
        movies.add("Joker");
        movies.add("Spider-Man");
        movies.add("Lion King");
        movies.add("Interstellar");

        // Display all movie names
        System.out.println("Movie names:");
        System.out.println(movies);

        // Try to add a duplicate movie
        movies.add("Joker"); // duplicate

        // Display set after attempting duplicate
        System.out.println(movies);

        // Check if a movie exists
        System.out.println("Spider-Man exists:" + movies.contains("Spider-Man"));

        // Remove a movie
        movies.remove("Inception");
        System.out.println(movies);

        // Display total number of movies
        System.out.println("Total number of movies: " + movies.size());

        // Clear all movies
        movies.clear();
        System.out.println(movies);

        // Confirm set is empty
        System.out.println("Final size of set: " + movies.size());

    }
}
