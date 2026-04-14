import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> usernames = new HashSet<>();

        // Add at least 5 user names
        usernames.add("user1");
        usernames.add("user2");
        usernames.add("user3");
        usernames.add("user4");
        usernames.add("user5");

        // Display elements before clearing
        System.out.println(usernames);

        // Display size before clearing
        System.out.println("Number of usernames before clearing: " + usernames.size());

        // Clear all elements from the set
        usernames.clear();

        // Display set after clearing
        System.out.println(usernames);

        // Display size after clearing
        System.out.println("Number of usernames after clearing: " + usernames.size());

    }
}
