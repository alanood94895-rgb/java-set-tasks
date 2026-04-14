import java.util.HashSet;
import java.util.Set;

public class AppSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> apps = new HashSet<>();

        // Add at least 5 mobile app names
        apps.add("WhatsApp");
        apps.add("Instagram");
        apps.add("Snapchat");
        apps.add("TikTok");
        apps.add("YouTube");

        // Display all app names
        System.out.println("Mobile app names:");
        System.out.println(apps);

        // Try to add a duplicate app name
        apps.add("WhatsApp"); // duplicate

        // Display set after attempting duplicate
        System.out.println(apps);

        // Check if an app exists

        System.out.println("Instagram exists:" + apps.contains("Instagram"));

        // Remove an app
        apps.remove("Snapchat");
        System.out.println(apps);

        // Display total number of apps
        System.out.println("Total number of apps: " + apps.size());

        // Clear all apps
        apps.clear();
        System.out.println("After clearing all apps:");
        System.out.println(apps);

        // Confirm set is empty
        System.out.println("Final size of set: " + apps.size());
    }
}
