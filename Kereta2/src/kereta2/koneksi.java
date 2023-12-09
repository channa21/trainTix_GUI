
package kereta2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_kereta2";
            String user = "root";
            String pass = "channa160402";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
            
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database Gagal");
        }
        return MySQLConfig;
    }
} 











