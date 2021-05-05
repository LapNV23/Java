package Java2;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        //Creating an ArrayList of String
        List<String> animal = new ArrayList<>();

        //Adding new elements to the ArrayList
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Dog");

        System.out.println(animal);

        // Adding an element at a particular index in a ArrayList
        animal.add(2, "Elephant");

        System.out.println(animal);
    }
}
