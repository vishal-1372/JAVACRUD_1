import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/mca_1";
        String user = "root";
        String password = "";

        String query = "INSERT INTO crate (name, description) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, "Wooden Crate");
            pstmt.setString(2, "A simple wooden crate for storage");
            pstmt.executeUpdate();

            pstmt.setString(1, "Metal Crate");
            pstmt.setString(2, "A sturdy metal crate for shipping");
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
