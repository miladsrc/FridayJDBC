package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    conector con = new conector();

    public UserRepository() throws SQLException {
    }

    public int registerUser(User user) throws SQLException {
        Connection con = conector.getConnection();
        String sql = "insert into users(first_name,last_name,username,password) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getAstName());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());

        int result = preparedStatement.executeUpdate();
        return result;

    }

    public User findByUsername(String user) throws SQLException {
        Connection con = conector.getConnection();

        String findByUsername = "select * from users where username = ?";
        PreparedStatement preparedStatement = con.prepareStatement(findByUsername);

        preparedStatement.setString(1, user);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstname = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            return new User(id, firstname, lastName, username, password);
        } else {
            return null;
        }


    }

}
