package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class UserService {


    private static  final Scanner scanner = new Scanner(System.in);
    private static   final UserRepository userRepository;

    static {
        try {
            userRepository = new UserRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public UserService() throws SQLException {
    }

    public static void signUp() throws SQLException {
        System.out.println("please enter your firstname :");
        String firstName = scanner.nextLine();

        System.out.println("please enter your last name :");
        String lastName = scanner.nextLine();

        System.out.println("please enter your username:");
        String username = scanner.nextLine();

        System.out.println("please enter your password :");
        String password = scanner.nextLine();

        User user = new User(firstName,lastName,username,password);
        int result = userRepository.registerUser(user);

        if(result == 1){
            System.out.println(firstName+" -- successfully registered !");
        }else {
            System.out.println("-- not registered");
        }


    }

    public static void signIn() throws SQLException {
        System.out.println("enter your username :");
        String username = scanner.nextLine();

        System.out.println("enter your password :");
        String password = scanner.nextLine();

        User user = userRepository.findByUsername(username);

        if (user == null){
            System.out.println("sign in first");
        } else if (! user.getPassword().equals(password)) {
            System.out.println("enter correct password");
        }else {
            System.out.println("you signed in "+user.getUsername());
        }
    }
}
