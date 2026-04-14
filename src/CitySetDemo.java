import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> cities = new HashSet<>();

        // Add at least 5 city names
        cities.add("Muscat");
        cities.add("Salalah");
        cities.add("Sohar");
        cities.add("Nizwa");
        cities.add("Sur");

        // Display all city names
        System.out.println("City names:");
        System.out.println(cities);

        // Try to add a duplicate city
        cities.add("Muscat"); // duplicate

        // Display set after attempting duplicate
        System.out.println("After attempting to add duplicate (Muscat):");
        System.out.println(cities);

        // Check if a city exists
        System.out.println ("Salalah exists:"+ cities.contains ("Salalah"));



        // Remove a city
        cities.remove("Sohar");
        System.out.println(cities);

        // Display total number of cities
        System.out.println("Total number of cities: " + cities.size());

        // Clear all cities
        cities.clear();
        System.out.println(cities);

        // Confirm set is empty
        System.out.println("Final size of set: " + cities.size());

    }
}