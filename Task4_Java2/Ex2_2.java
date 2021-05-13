package Task4_Java2;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name you to search: ");
        String name = scanner.nextLine();
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                ){
            String customer = "select * from customers \n WHERE ContactName = " + name + ";";
            System.out.println("The SQL statement is: " + customer + "\n");
            ResultSet print = stmt.executeQuery(customer);
            while (print.next()){
                String CustomerID = print.getString("CustomerID");
                String CompanyName = print.getString("CompanyName");
                String ContactName = print.getString("ContactName");
                String ContactTitle = print.getString("ContactTitle");
                String Address = print.getString("Address");
                String City = print.getString("City");
                String Region = print.getString("Region");
                String PostalCode = print.getString("PostalCode");
                String Country = print.getString("Country");
                String Phone = print.getString("Phone");
                String Fax = print.getString("Fax");
                System.out.println(CustomerID + "," + CompanyName + "," +
                        ContactName + "," + ContactTitle + "," + Address +
                        "," + City + "," + Region + "," + PostalCode + "," +
                        Country + "," + Phone + "," + Fax);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
