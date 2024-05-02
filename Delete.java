import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/mca_1";
        String user = "root";
        String password = "";

    
        String query = "DELETE FROM crate WHERE name = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, "Metal Crate");
            int rowsDeleted = pstmt.executeUpdate();

        
            if (rowsDeleted > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("No data found for deletion!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
