package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {

        //Connecting to the database
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");
            System.out.println("Connection.isValid(0) = "+connection.isValid(0));
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }
}
