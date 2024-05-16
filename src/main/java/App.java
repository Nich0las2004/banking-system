package main.java;

import main.java.banking.service.Bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        Bank bank = new Bank();

        boolean isAuthenticated = bank.authenticateUser(username, password);

        if (isAuthenticated) {
            System.out.println("Authentication successful. Welcome, " + username + "!");
        } else {
            System.out.println("Authentication failed. Please check your username and password.");
        }

    }
}
