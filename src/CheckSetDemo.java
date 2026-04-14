import java.util.HashSet;
import java.util.Set;

public class CheckSetDemo {
    public static void main (String[] args){

        // Create a Set using HashSet implementation
        Set <String> employeeIDs= new HashSet<>();

        // Add at least 5 employee IDs
        employeeIDs.add ("a111");
        employeeIDs.add ("b222");
        employeeIDs.add ("c333");
        employeeIDs.add ("d444");
        employeeIDs.add ("e555");

        // Display all elements in the set
        System.out.println(employeeIDs);

        //Check if an exisiting ID is present
        System.out.println(employeeIDs.contains("a111"));

        //Check if non exisiting ID
        System.out.println(employeeIDs.contains("h111"));






    }
}
