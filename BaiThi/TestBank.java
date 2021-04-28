package BaiThi;

import java.util.Scanner;
import java.util.SortedMap;

public class TestBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("So tien ban no la: ");
        double balance = scan.nextDouble();
        System.out.println("Lai suat la: ");
        double rate = scan.nextDouble();
        System.out.println("So lai hang thang la: ");

        Bank B1 = new Bank(balance, rate);
        System.out.println("Bank");
        System.out.println("$" + balance);
        System.out.println("$" + rate);
        System.out.printf("Interest: $%.2f%n ", B1.calculateInterest());

    }
}
