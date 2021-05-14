package Task5_Java2;

import java.sql.*;

public class Read_Drinks_List {
    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/drinks_list", "root", ""
            );
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select id, name, price from drinks";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt. executeQuery(strSelect);
            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()){
                int id = rset.getInt("id");
                String name = rset.getString("name");
                int price = rset.getInt("price");
                System.out.println(id + ", " + name + ", " + price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
