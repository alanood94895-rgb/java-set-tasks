import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> products = new HashSet<>();

        // Add at least 5 product names
        products.add("Laptop");
        products.add("Smartphone");
        products.add("Tablet");
        products.add("Monitor");
        products.add("Keyboard");

        // Display the set before removal
        System.out.println(products);

        // Remove one product
        products.remove("Tablet");

        // Display the set after removal
        System.out.println(products);
    }
}
