import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> courses = new HashSet<>();

        // Add at least 5 course names
        courses.add("Java Programming");
        courses.add("Database Systems");
        courses.add("Web Development");
        courses.add("Networking");
        courses.add("Cyber Security");

        // Display all course names
        System.out.println("Course names:");
        System.out.println(courses);

        // Try to add a duplicate course
        courses.add("Java Programming"); // duplicate

        // Display set after attempting duplicate
        System.out.println(courses);

        // Check if a course exists
        System.out.println("Web Development exists:"+ courses.contains ("Web Development"));


        // Remove a course
        courses.remove("Database Systems");
        System.out.println(courses);

        // Display total number of courses
        System.out.println("Total number of courses: " + courses.size());

        // Clear all courses
        courses.clear();
        System.out.println(courses);

        // Confirm set is empty
        System.out.println("Final size of set: " + courses.size());
    }
}
