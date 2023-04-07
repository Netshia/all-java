package com.ndivhuho.database.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The is used to create database tables using Data Definition Language (DDL).
 */
public class CreateTableDDL {

    public static void main(String[] args) {
        createPersonTable();
    }

    /**
     * Create person table if does not exist, using executeUpdate method of {@link Statement} object.
     */
    public static void createPersonTable() {

        try (final Connection connection = DBConnector.getDBConnection();
        final Statement statement = connection.createStatement()) {

            statement.executeUpdate(
                """
                CREATE TABLE IF NOT EXIST Person
                ( id INT PRIMARY KEY AUTO_INCREMENT,
                  first_name VARCHAR(50) NOT NULL,
                  last_name VARCHAR(50)
                );
                """
            );

        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
