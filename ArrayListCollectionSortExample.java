package Java2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionSortExample {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(7);
        number.add(18);
        number.add(5);
        number.add(2);

        System.out.println("Before : " + number);

        //Sorting an ArrayList using Collections.sort() method
        Collections.sort(number);

        System.out.println("After : " + number);
    }
}
