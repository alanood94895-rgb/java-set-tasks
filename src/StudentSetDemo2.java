import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo2 {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> students = new HashSet<>();

        // Add at least 5 student names
        students.add("Noor");
        students.add("Sara");
        students.add("Omar");
        students.add("Noof");
        students.add("sultan");

        // Display all student names
        System.out.println("Student names:");
        System.out.println(students);

        // Try to add a duplicate student name
        students.add("Sara"); // duplicate

        // Display set after attempting duplicate
        System.out.println(students);

        // Check if a student exists
        System.out.println("sultan exists:" + students.contains("sultan"));


        // Remove a student
        students.remove("Omar");
        System.out.println(students);

        // Display total number of students
        System.out.println("Total number of students: " + students.size());

        // Clear all students
        students.clear();
        System.out.println(students);

        // Confirm set is empty
        System.out.println("Final size of set: " + students.size());
    }
}
