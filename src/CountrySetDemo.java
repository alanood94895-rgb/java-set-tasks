import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> countries = new HashSet<>();

        // Add 5 country names
        countries.add("Oman");
        countries.add("UAE");
        countries.add("Saudi Arabia");
        countries.add("Qatar");
        countries.add("Bahrain");

        // Display countries
        System.out.println("Countries:");
        System.out.println(countries);

        // Add one more country
        countries.add("Kuwait");
        System.out.println(countries);

        // Try duplicate country
        countries.add("Oman");

        System.out.println(countries);


        // contains() checks
        System.out.println("UAE exists: " + countries.contains("UAE"));

        // remove country
        countries.remove("Qatar");
        System.out.println(countries);

        // size
        System.out.println("Total countries: " + countries.size());

        // add new country
        countries.add("Jordan");
        System.out.println(countries);

        // updated size
        System.out.println("Updated total countries: " + countries.size());

        // clear all countries
        countries.clear();
        System.out.println(countries);

        // confirm empty
        System.out.println("Final size: " + countries.size());
        System.out.println("Set now contains zero elements.");
    }
}
