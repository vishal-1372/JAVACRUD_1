import java.sql.*;
import java.sql.Connection;
class conn
{ 
    public static void main(String[] args) 
    {
        try
        {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mca_1";
            String unm="root";
            String pwd="";
            Connection con = DriverManager.getConnection(url, unm, pwd);
            
            if(con.isClosed())
            {
                System.err.println("conn is not create");
            }
            else
            {
                System.out.println("Conn is created...");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}