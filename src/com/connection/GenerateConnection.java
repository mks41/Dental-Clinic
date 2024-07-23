package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenerateConnection {
    private static String user = "mks";
    private static String password = "mks";
    private static String db = "DentalDb";
    private static String ip = "localhost";
    private static String port = "1433";
    private static boolean encrypt = true;
    private static boolean trustServerCertificate = true;
    private static String connectionUrl = "jdbc:sqlserver://" + ip + ":" + port + ";" 
        + "databaseName=" + db + ";"
        + "encrypt=" + encrypt + ";" 
        + "trustServerCertificate=" + trustServerCertificate + ";";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(connectionUrl, user, password);
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
            return null;
        }
    }
}
