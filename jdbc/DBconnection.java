package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    
    private static final String Url="jdbc:mysql://localhost:3306/database_name";
     private static final String Username="XYZ";
      private static final String password="abc";

      public static Connection getconn() throws SQLException{
            try {
                return DriverManager.getConnection(Url,Username,password);
            } catch (SQLException e) {
    
                     e.getMessage();
            }
            return null;
      }

}

