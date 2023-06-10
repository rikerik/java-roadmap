package com.JDBC;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {

        //Connecting to the database
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");
            System.out.println("Connection.isValid(0) = " + connection.isValid(0));

            //CRUD

            //select

            PreparedStatement preparedStatement = connection.prepareStatement("select * from USERS where name =?");
            preparedStatement.setString(1, "Erik");

            ResultSet resultSet = preparedStatement.executeQuery();
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
}
