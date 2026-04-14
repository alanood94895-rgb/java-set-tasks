import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> students = new HashSet<>();

        // Add at least 5 student names
        students.add("Ali");
        students.add("Sara");
        students.add("Alanoud");
        students.add("said");
        students.add("mohammed");

        // Display all student names
        System.out.println("Student names:");
        System.out.println(students);

        // Try to add a duplicate name
        students.add("Alanoud"); // duplicate

        // Display set after attempting duplicate
        System.out.println(students);

        // Check if a student exists
        System.out.println("Sara exists:"+ students.contains ("Sara");


        // Remove a student name
        students.remove("mohammed");

        // Display after remove
        System.out.println(students);

        // Display total number of students
        System.out.println("Total number of students: " + students.size());

        // Clear all student names
        students.clear();
        System.out.println(students);

        // Confirm set is empty
        System.out.println("Final size of set: " + students.size());

    }
}
