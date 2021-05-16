package Task5_Java2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drink_list", "root", ""
            ); Statement stmt = conn.createStatement();
        ){
            Scanner scanner = new Scanner(System.in);
            int y = 0;
            do{
                System.out.println("List");
                System.out.println("1. Insert to table.");
                System.out.println("2. Search in table.");
                System.out.println("3. Update in table.");
                System.out.println("4. Remove in table.");
                System.out.println("5. Print table.");
                System.out.println("6. Exit.\n");
                System.out.println("Enter the number:");
                y = Integer.parseInt(scanner.nextLine());
                switch (y){
                    case 1:
                        System.out.println("Set id:");

                }
            }
        }
    }
}
