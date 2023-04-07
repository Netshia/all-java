package com.ndivhuho.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Select data into Person table, using DML.
 */
public class SelectDML {

    public static void main(String[] args) {
        selectPerson();
    }

    /**
     * Select Person table, using DML.
     */
    public static void selectPerson() {

        try (final Connection connection = DBConnector.getDBConnection();
             final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery("SELECT * FROM Person")) {

            System.out.println("Id \tFirstName \tLastName");

            while (resultSet.next()) {
                System.out.printf("%s\t%s\t%s\n",
                        resultSet.getObject(1),
                        resultSet.getObject(2),
                        resultSet.getObject(3)
                        );
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
