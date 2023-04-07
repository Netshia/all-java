package com.ndivhuho.database.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The class to insert data into database table, using Database Manipulation Language (DML)
 */
public class InsetDataDML {

    public static void main(String[] args) {
        insertIntoPerson();
    }

    /**
     * Inset data into Person table, using DML.
     */
    public static void insertIntoPerson() {

        try (final Connection connection = DBConnector.getDBConnection();
             final Statement statement = connection.createStatement()) {

            statement.executeUpdate(
                """
                INSERT INTO Person(first_name, last_name)
                VALUES ('Ndivhuho', 'Netshia');
                """
            );

        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
