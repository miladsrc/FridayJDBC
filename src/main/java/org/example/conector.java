package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conector {
private static final Connection connection;

    static {
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/login","postgres","9010231394");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public conector() throws SQLException {
    }

    public static Connection getConnection(){
        return connection;
    }
}
