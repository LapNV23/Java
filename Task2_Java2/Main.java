package Task2_Java2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends ContactList{

    public static void main(String[] args) {
        int X;

        System.out.println("Starting phone...\n");
        System.out.println("Available actions:\npress");
        System.out.println("0  - to shutdown");
        System.out.println("1  - to print contacts");
        System.out.println("2  - to add a new contact");
        System.out.println("3  - to update existing an existing contact");
        System.out.println("4  - to remove an existing contact");
        System.out.println("5  - query if an existing contact exists");
        System.out.println("6  - to print a list of available actions.");
        System.out.println("Choose your action:\n");
        System.out.println("Enter action: (6 to show available actions)\n");
        Scanner choose = new Scanner(System.in);
        X = choose.nextInt();
        if(X == 0){
            System.out.println("Thank you! See you again!");
        }
        else if(X == 1){
            System.out.println("Contact List");
            System.out.println();

        }
    }
}
