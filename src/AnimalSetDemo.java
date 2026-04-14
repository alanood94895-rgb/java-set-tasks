import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> animals = new HashSet<>();

        // Add 5 animal names
        System.out.println("Adding initial animals");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        System.out.println("Animals after initial addition:");
        System.out.println(animals);

        // Add one more animal
        System.out.println("adding one more animal: Panda");
        animals.add("Panda");
        System.out.println(animals);

        // Try duplicate (must be from original list)
        animals.add("Lion");

        System.out.println(animals);

        // contains() - successful check
        System.out.println("Zebra exists: " + animals.contains("Zebra"));

        // contains() - unsuccessful check
        System.out.println("Result: " + animals.contains("Horse"));

        // remove existing animal
        animals.remove("Elephant");
        //Display after Remove
        System.out.println(animals);

        // size before adding new animal
        System.out.println("Current number of animals: " + animals.size());

        // add new animal
        System.out.println("Adding new animal: Bear");
        animals.add("Bear");

        System.out.println("Animals after adding Bear:");
        System.out.println(animals);

        // updated size
        System.out.println("Updated number of animals: " + animals.size());

        // clear all animals
        animals.clear();

        System.out.println("Animals after clear:");
        System.out.println(animals);

        // confirm empty set
        System.out.println("Final size after clear: " + animals.size());
        System.out.println("The set now contains zero elements.");
    }

}
