import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemo2 {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> subjects = new HashSet<>();

        // Add 5 subject names
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("Arabic");
        subjects.add("Islamic");

        // Display subjects
        System.out.println("Subjects:");
        System.out.println(subjects);

        // Add one more subject
        subjects.add("Physics");
        System.out.println(subjects);

        // Try duplicate subject
        subjects.add("Math");

        System.out.println(subjects);

        // contains() checks
        System.out.println("Islamic exists: " + subjects.contains("Islamic"));

        // remove subject
        subjects.remove("English");
        System.out.println(subjects);

        // size
        System.out.println("Total subjects: " + subjects.size());

        // add new subject
        subjects.add("Art");
        System.out.println(subjects);

        // updated size
        System.out.println("Updated total subjects: " + subjects.size());

        // clear all subjects
        subjects.clear();
        System.out.println(subjects);

        // confirm empty
        System.out.println("Final size: " + subjects.size());
        System.out.println("Set now contains zero elements.");
    }

}
