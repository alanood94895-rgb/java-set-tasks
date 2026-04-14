import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        Set<String> cars = new HashSet<>();

        // Add 5 car names
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("GMC");
        cars.add("Nissan");

        // Display cars
        System.out.println("Car names:");
        System.out.println(cars);

        // Add one more car
        cars.add("Mercedes");
        System.out.println(cars);

        // Try duplicate car
        cars.add("Toyota");

        System.out.println(cars);


        // contains() checks
        System.out.println("GMC exists: " + cars.contains("GMC"));

        // remove car
        cars.remove("BMW");
        System.out.println(cars);

        // size
        System.out.println("Total cars: " + cars.size());

        // add new car
        cars.add("Kia");
        System.out.println(cars);

        // updated size
        System.out.println("Updated total cars: " + cars.size());

        // clear all cars
        cars.clear();
        System.out.println(cars);

        // confirm empty
        System.out.println("Final size: " + cars.size());
        System.out.println("Set now contains zero elements.");
    }
}
