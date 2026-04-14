import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> flowers = new HashSet<>();

        // Add 5 flower names
        System.out.println("Adding initial flowers...");
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Jasmine");

        System.out.println("Flowers after initial addition:");
        System.out.println(flowers);

        // Add one more flower
        System.out.println("Adding one more flower: Daisy");
        flowers.add("Daisy");
        System.out.println(flowers);

        // Try duplicate flower (must be from original list)
        System.out.println("Trying to add duplicate flower: Rose");
        flowers.add("Rose");

        System.out.println("After duplicate test:");
        System.out.println(flowers);

        // contains() - successful check
        System.out.println("Jasmine exists: " + flowers.contains("Jasmine"));

        // contains() - unsuccessful check
        System.out.println("Orchid exists: " + flowers.contains("Orchid"));


        // remove existing flower
        System.out.println("Removing 'Tulip' from set");
        flowers.remove("Tulip");

        System.out.println("Flowers after removal:");
        System.out.println(flowers);

        // size before adding new flower
        System.out.println("Current number of flowers: " + flowers.size());

        // add new flower
        System.out.println("Adding new flower: Orchid");
        flowers.add("Orchid");

        System.out.println("Flowers after adding Orchid:");
        System.out.println(flowers);

        // updated size
        System.out.println("Updated number of flowers: " + flowers.size());

        // clear all flowers
        System.out.println("Clearing all flowers...");
        flowers.clear();

        System.out.println("Flowers after clear:");
        System.out.println(flowers);

        // confirm empty set
        System.out.println("Final size after clear: " + flowers.size());
        System.out.println("The set now contains zero elements.");
    }

}
