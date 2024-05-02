import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mca_1";
        String user = "root";
        String password = "";

        String query = "UPDATE crate SET description = ? WHERE name = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            
            pstmt.setString(1, "A wooden crate for storage and transportation");
            pstmt.setString(2, "Wooden Crate");
            int rowsUpdated = pstmt.executeUpdate();

            
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("No data found for update!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
