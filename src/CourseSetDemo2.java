import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo2 {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> courses = new HashSet<>();

        // Add  course names
        courses.add("Math");
        courses.add("English");
        courses.add("Science");
        courses.add("History");
        courses.add("Computer");

        //Display all courses
        System.out.println("Courses:");
        System.out.println(courses);

        // Add duplicate
        courses.add("Math");

        // Display set after attempting duplicate
        System.out.println(courses);

        // Check if course exists
        System.out.println("Art exists: " + courses.contains("Art"));

        // Remove a course
        courses.remove("History");

        System.out.println(courses);

        // Size
        System.out.println("Total courses: " + courses.size());

        // Clear all
        courses.clear();
        System.out.println(courses);
        System.out.println("Final size: " + courses.size());
    }
}
