package com.JDBC;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {

        // Create a DataSource object using HikariCP connection pool
        DataSource dataSource = createDatasource();

        //Connecting to the database
        try {
            // Obtain a connection from the DataSource
            Connection connection = dataSource.getConnection();
            System.out.println("Connection.isValid(0) = " + connection.isValid(0));

            //CRUD

            //select

            PreparedStatement preparedStatement = connection.prepareStatement("select * from USERS where name =?");
            preparedStatement.setString(1, "Erik");
            ResultSet resultSet = preparedStatement.executeQuery();

            // Iterate through the result set and print user information
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("name"));
            }

            //insert

            PreparedStatement insertPreparedStatement = connection.prepareStatement("insert into USERS (name) values (?)");
            insertPreparedStatement.setString(1, "Dori");
            int insertCount = insertPreparedStatement.executeUpdate();
            System.out.println("insertCount = " + insertCount);

            //update

            PreparedStatement updatePreparedStatement = connection.prepareStatement("update USERS set name = ? where name = ?");
            updatePreparedStatement.setString(1, "Doroti");
            updatePreparedStatement.setString(2, "Dori");
            int updateCount = updatePreparedStatement.executeUpdate();
            System.out.println("updateCount = " + updateCount);

            //delete

            PreparedStatement deletePreparedStatement = connection.prepareStatement("delete from USERS where name = ?");
            deletePreparedStatement.setString(1, "Doroti");
            int deleteCount = deletePreparedStatement.executeUpdate();
            System.out.println("deleteCount = " + deleteCount);

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    private static DataSource createDatasource() {
        // Create a new instance of HikariDataSource
        HikariDataSource ds = new HikariDataSource();
        // Set the JDBC URL for the H2 in-memory database and initialize it with the "users.sql" script
        ds.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");
        return ds;
        //hikaricp -connection pool
        //DriverManager.getConnection("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");

    }
}
