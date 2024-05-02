import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {

    public static void main(String[] args) {
 
        
        String url = "jdbc:mysql://localhost:3306/mca_1";
        String user = "root";
        String password = "";

        String query = "CREATE TABLE crate (" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "name VARCHAR(50)," +
                            "description VARCHAR(255)" +
                        ")";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(query);
            System.out.println("Table 'crate' created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
