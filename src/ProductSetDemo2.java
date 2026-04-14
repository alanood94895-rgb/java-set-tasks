import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo2 {
    public static void main(String[] args) {

        // Create a Set using HashSet implementation
        Set<String> products = new HashSet<>();

        // Add at least 5 product names
        products.add("Laptop");
        products.add("Phone");
        products.add("Tablet");
        products.add("Headphones");
        products.add("Smartwatch");

        // Display all product names
        System.out.println("Product names:");
        System.out.println(products);

        // Try to add a duplicate product
        products.add("Phone"); // duplicate

        // Display set after attempting duplicate
        System.out.println(products);

        // Check if a product exists
        System.out.println("Laptop exists:" + products.contains("Laptop"));


        // Remove a product
        products.remove("Tablet");
        System.out.println(products);

        // Display total number of products
        System.out.println("Total number of products: " + products.size());

        // Clear all products
        products.clear();
        System.out.println(products);

        // Confirm set is empty
        System.out.println("Final size of set: " + products.size());

    }
}