import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main (String[] args){
        // Create a Set using HashSet implementation
        Set <String>employeeIDs= new HashSet<>();
        // Add at least 5 employee IDs
        employeeIDs.add("a101");
        employeeIDs.add("b102");
        employeeIDs.add("c103");
        employeeIDs.add("d104");
        employeeIDs.add("e105");

        // Display all elements
        System.out.println(employeeIDs);

        // Try to add a duplicate ID
        employeeIDs.add("c103"); // duplicate

        // Display set after attempting duplicate
        System.out.println(employeeIDs);

        // Check if a specific ID exists
        System.out.println("c103 exists:"+ employeeIDs.contains ("c103");

        // Remove an employee ID
        employeeIDs.remove("d104");
       // Display after remove
        System.out.println(employeeIDs);

        // Display total number of elements
        System.out.println("Total number of employee IDs: " + employeeIDs.size());

        // Clear all elements
        employeeIDs.clear();
        System.out.println(employeeIDs);

        // Confirm set is empty
        System.out.println("Final size of set: " + employeeIDs.size());

    }
}
