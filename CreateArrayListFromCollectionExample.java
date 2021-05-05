package Java2;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(11);

        //Creating an ArrayList form another collection
        List<Integer> fistTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstFivePrimeNumber.addAll(nextFivePrimeNumbers);

        System.out.println(firstFivePrimeNumber);
    }
}
