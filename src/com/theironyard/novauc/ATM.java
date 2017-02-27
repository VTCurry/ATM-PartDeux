package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vtcurry on 2/27/17.
 */
public class ATM {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Double> account = new HashMap<> ();
    String name = "";

    public void menu (){
        while (true) {
            System.out.println("Welcome to Illuminati ATM");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ Illuminati Bank & Trust  $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("What is your name?");

            name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            if (accountCheck()) {
                login();
            } else {
                createAccount();
            }
        }
    }

    public void createAccount (){
        System.out.println("Account not found. Would you like to open an account? [Y/N]");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")){
            account.put(name, 10.0);
        } else {
            System.out.println("No account created.");
        }
    }

    public boolean accountCheck(){
        return account.containsKey(name);
    }

    public void login () {
        while (true) {
            System.out.println("[1] Check my balance");
            System.out.println("[2] Withdraw Funds");
            System.out.println("[3] Deposit");
            System.out.println("[4] Close");
            System.out.println("[5] Cancel");

            String choice = scanner.nextLine();
            switch (Integer.valueOf(choice)){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    close();
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Enter the correct choice.");
                    break;
            }
        }
    }
    public void deposit() {
        System.out.println("How much would you like to deposit?");
        double deposit = Double.valueOf(scanner.nextLine());
        account.put(name, (account.get(name) + deposit));
    }
    public void checkBalance() {
        System.out.println("Your balance is: $" + account.get(name));
    }

    public void withdraw() {
        System.out.println("How much would you like to withdraw?");
        double withdraw = Double.valueOf(scanner.nextLine());
        if (account.get(name) < withdraw){
            System.out.println("Insuffcient Funds");
        } else {
            account.put(name, (account.get(name) - withdraw));
        }
    }

    public void close() {
        System.out.println("Are you sure you want to close your account? [Y/N]");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")){
            account.remove(name);
        } else {
            System.out.println("Your account was not closed.");
        }
    }
}
