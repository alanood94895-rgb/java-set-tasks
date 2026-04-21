import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {

    public static void main(String[] args) {

        // Create a HashSet
        Set<String> productSet = new HashSet<>();

        // Add products to the set
        productSet.add("aaaa");
        productSet.add("bbbb");
        productSet.add("cccc");
        productSet.add("eeee");
        productSet.add("ffff");

        System.out.println(productSet);

        productSet.add("hhhh");

        System.out.println(productSet);
    }
}