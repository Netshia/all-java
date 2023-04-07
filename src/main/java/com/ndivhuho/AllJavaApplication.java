
package com.ndivhuho;

import com.ndivhuho.database.jdbc.DBConnector;

import java.sql.SQLException;

public class AllJavaApplication {

    public static void main(String[] args) throws SQLException {
        DBConnector.getDBConnection();
    }
}