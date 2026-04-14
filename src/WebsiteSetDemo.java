import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> websites = new HashSet<>();

        // Add at least 5 website names
        websites.add("google.com");
        websites.add("youtube.com");
        websites.add("facebook.com");
        websites.add("instagram.com");
        websites.add("twitter.com");

        // Display all website names
        System.out.println("Website names:");
        System.out.println(websites);

        // Try to add a duplicate website
        websites.add("google.com"); // duplicate

        // Display set after attempting duplicate
        System.out.println(websites);

        // Check if a website exists

        System.out.println("youtube.com exists:" + websites.contains("youtube.com"));

        // Remove a website
        websites.remove("facebook.com");
        System.out.println(websites);

        // Display total number of websites
        System.out.println("Total number of websites: " + websites.size());

        // Clear all websites
        websites.clear();
        System.out.println(websites);

        // Confirm set is empty
        System.out.println("Final size of set: " + websites.size());
    }
}