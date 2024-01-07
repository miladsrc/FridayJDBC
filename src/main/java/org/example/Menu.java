package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private static final UserService userService;

    static {
        try {
            userService = new UserService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void publicMenu() throws SQLException {
        System.out.println("***welcome***");
        System.out.println("1 - sign up");
        System.out.println("2 - log in");
        System.out.println("3 - exit");
        System.out.print("--->");

        int number = scanner.nextInt();
        scanner.nextLine();


        //adding switch to choose

        switch (number) {
            case 1 -> signUp();
            case 2 -> signIn();
            case 3 -> System.out.println("exit");
        }

    }

    public void signUp() throws SQLException {
        UserService.signUp();
    }

    public void signIn() throws SQLException{
        UserService.signIn();
    }
}
