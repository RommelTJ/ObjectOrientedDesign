package com.rommelrico.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Rommel on 4/24/2016.
 */
public class DatabaseConnectionManager extends DatabaseConnection {
    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {

    }

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionInstance;
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }
    public Connection getConnectionObject() {
        return conn;
    }
    public void disconnect() {
        System.out.println("Disconnect");
    }
}
