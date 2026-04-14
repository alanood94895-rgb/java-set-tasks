import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> departments = new HashSet<>();

        // Add at least 5 department names
        departments.add("HR");
        departments.add("Finance");
        departments.add("IT");
        departments.add("Marketing");
        departments.add("Operations");

        // Display all elements in the set
        System.out.println(departments);

        // Display the number of elements using size()
        System.out.println("Number of departments: " + departments.size());

        // Add one more unique department
        departments.add("Sales");

        // Display updated size
        System.out.println("Updated number of departments: " + departments.size());

    }
}
