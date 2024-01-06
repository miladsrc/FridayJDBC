package org.example;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    public void publicMenu(){
        System.out.println("***welcome***");
        System.out.println("1 - sign up");
        System.out.println("2 - log in");
        System.out.println("3 - exit");
        System.out.print("--->");

        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
    }
}
