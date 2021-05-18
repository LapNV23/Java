package Task6_Java2;

import java.sql.*;
import java.util.Scanner;

public class JdbcInsertTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root",""
                );
                Statement stmt = conn.createStatement();
                ){
            String sqlDelete = "delete from books where id >= 3000 and id < 4000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            //Insert a record
            String sqlInsert = "Insert into books values(3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
            System.out.println("The SQL statement is: " + sqlInsert +"\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            //Insert ,multiple records
            sqlInsert = "insert into books values "
                    + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                    + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
            System.out.println("The SQL statement is: " + sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "records inserted.\n");

            //Insert a partial record
            sqlInsert = "insert into books (id, title, author) values (3004, 'Fishing101', 'Kumar')";
            System.out.println("The SQL statement is: " + sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

            //Issue a select to check the changes
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id") + ","
                        + rset.getString("author") + ","
                        + rset.getDouble("price") + ","
                        + rset.getInt("qty"));
            }
            //C1
            sqlDelete = "delete from books where id >= 8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
            //C2
            sqlInsert = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: \n" + sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            //C3
            sqlInsert = "insert into books (id, title, author) values (2001, 'JavaJDBC MySQL', 'ThiDK')";
            System.out.println("The SQL statement is: " + sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            //C4
            sqlDelete = "delete from books where id = 2001";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
            //C5
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add books");
            System.out.println("Id:");
            int id1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Title: ");
            String name1 = scanner.nextLine();
            System.out.println("Author: ");
            String author1 = scanner.nextLine();
            System.out.println("Qty: ");
            int qty1 = Integer.parseInt(scanner.nextLine());
            String insert1 = "insert into books values(?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insert1);
            pstmt.setInt(1, id1);
            pstmt.setString(2, name1);
            pstmt.setString(3, author1);
            pstmt.setInt(4, qty1);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " books inserted");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
