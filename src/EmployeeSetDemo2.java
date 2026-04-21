import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo2 {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> employees = new HashSet<>();

        // Add 5 employee names
        employees.add("said");
        employees.add("mayas");
        employees.add("mayar");
        employees.add("Noor");
        employees.add("Maha");

        // Display employees
        System.out.println("Employees:");
        System.out.println(employees);

        // Add one more employee
        employees.add("Abdullah");
        System.out.println(employees);

        // Try duplicate employee
        employees.add("said");

        System.out.println(employees);


        // contains() checks
        System.out.println("Noor exists: " + employees.contains("Noor"));

        // remove employee
        employees.remove("Maha");
        System.out.println(employees);

        // size
        System.out.println("Total employees: " + employees.size());

        // add new employee
        employees.add("Salah");
        System.out.println(employees);

        // updated size
        System.out.println("Updated total employees: " + employees.size());

        // clear all employees
        employees.clear();
        System.out.println(employees);

        // confirm empty
        System.out.println("Final size: " + employees.size());
        System.out.println("Set now contains zero elements.");
    }
}

