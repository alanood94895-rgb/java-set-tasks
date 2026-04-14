import java.util.HashSet;
import java.util.Set;

public class CitySetDemo2 {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> cities = new HashSet<>();

        // Add 5 city names
        cities.add("Muscat");
        cities.add("Salalah");
        cities.add("Sohar");
        cities.add("Nizwa");
        cities.add("Sur");

        // Display cities
        System.out.println("Cities:");
        System.out.println(cities);

        // Add one more city
        cities.add("Ibri");
        System.out.println(cities);

        // Try duplicate city
        cities.add("Muscat");

        System.out.println(cities);


        // contains() checks
        System.out.println("Nizwa exists: " + cities.contains("Nizwa"));

        // remove a city
        cities.remove("Sohar");
        System.out.println(cities);

        // size
        System.out.println("Total cities: " + cities.size());

        // add new city
        cities.add("izki");
        System.out.println(cities);

        // updated size
        System.out.println("Updated total cities: " + cities.size());

        // clear all
        cities.clear();
        System.out.println(cities);

        // confirm empty
        System.out.println("Final size: " + cities.size());
        System.out.println("Set now contains zero elements.");
    }
}

