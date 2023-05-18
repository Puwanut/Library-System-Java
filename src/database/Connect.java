package database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kanasin
 */
import java.sql.*;

public class Connect {

    public static Connection connectDB() {
        String db_name = "mdb";
        String user = "root";
        String pass = "";
        String hostName = "localhost";
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            String url = "jdbc:mysql://" + hostName + "/" + db_name + "?useUnicode=true&characterEncoding=utf-8";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Successfully connected to the database.");
            return con;

        } catch (Exception e) {
            System.out.println("Failed to connect to the database.");
        }
        return null;
    }
}
