package Task2_Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n;
        double sum = 0;

        System.out.println("The integer quantity in the table you want to import is :");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter " +(n)+ " integer values");

        for(int i = 0; i < n; i++){
            Scanner y = new Scanner(System.in);
            numbers[i] = y.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Element" +(i)+ ", typed value was " +(numbers[i]));
        }
        for (int i = 0; i < n; i++){
            sum+=numbers[i];
        }

        System.out.print("Average = " + sum/n);

    }
}
