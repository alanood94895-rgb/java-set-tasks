import java.util.HashSet;
import java.util.Set;

public class CustomerSetDemo {
    public static void main(String[] args) {

        Set<String> customerIDs = new HashSet<>();

        // Add 5 customer IDs
        customerIDs.add("111");
        customerIDs.add("222");
        customerIDs.add("333");
        customerIDs.add("444");
        customerIDs.add("555");

        System.out.println(customerIDs);

        customerIDs.add("666");

        System.out.println(customerIDs);
    }
}
