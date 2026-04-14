import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {

    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> fruits = new HashSet<>();

        // Add 5 fruit names
        System.out.println("Adding initial fruits...");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("Fruits after initial addition:");
        System.out.println(fruits);

        // Add one more fruit
        System.out.println("Adding one more fruit: Strawberry");
        fruits.add("Strawberry");
        System.out.println(fruits);

        // Try duplicate (must be from original list)
        fruits.add("Apple");

        System.out.println(fruits);

        // contains() - successful check
        System.out.println("Orange exists: " + fruits.contains("Orange"));

        // contains() - unsuccessful check
        System.out.println("Kiwi exists: " + fruits.contains("Kiwi"));

        // remove existing fruit
        System.out.println("Removing 'Banana' from set");
        fruits.remove("Banana");

        System.out.println("Fruits after removal:");
        System.out.println(fruits);

        // size before adding new fruit
        System.out.println("Current number of fruits: " + fruits.size());

        // add new fruit
        System.out.println("Adding new fruit: Strawberry");
        fruits.add("Strawberry");

        System.out.println("Fruits after adding Strawberry:");
        System.out.println(fruits);

        // updated size
        System.out.println("Updated number of fruits: " + fruits.size());

        // clear all fruits
        System.out.println("Clearing all fruits");
        fruits.clear();

        System.out.println("Fruits after clear:");
        System.out.println(fruits);

        // confirm empty set
        System.out.println("Final size after clear: " + fruits.size());
        System.out.println("The set now contains zero elements.");
    }
}
