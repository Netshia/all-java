package com.ndivhuho.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * A util class contain static methods to get database {@link Connection}.
 */
public class DBConnector {

    /**
     * Get database connection
     *
     * @return database connection object of a type {@link Connection}.
     * @throws SQLException
     */
    public static Connection getDBConnection() throws SQLException {

        final String url = "jdbc:mysql://localhost/";
        final String database = "all-java";
        final String user = "root";
        final String password = "password";

        return DriverManager.getConnection(url + database, user, password);
    }

    /**
     * Get database connection by passing {@link Properties} object.
     *
     * @return database connection object of a type {@link Connection}.
     * @throws SQLException
     */
    public static Connection getDBConnection2() throws SQLException {

        final String url = "jdbc:mysql://localhost/all-java";
        final Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "password");

        return DriverManager.getConnection(url, properties);
    }
}
