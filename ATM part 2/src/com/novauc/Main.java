package com.novauc;

import java.util.Scanner;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        // public void choosename (){
        System.out.println("Welcome to Illuminati ATM");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ Illuminati Bank & Trust  $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        String name = scanner.nextLine();
        if (name.length() == 0) {
            throw new Exception("Not a valid name.");
        }

        while (true) {
            System.out.println("[1] Check my balance");
            System.out.println("[2] Withdraw Funds");
            System.out.println("[3] Close Account");
            System.out.println("[4] Cancel");
            String choice = scanner.nextLine();
            int choiceNum = Integer.valueOf(choice);
            if (choiceNum == 1) {
                System.out.println("Your balance is $" + balance);

            } else if (choiceNum == 4) {
                System.out.println("Thank you and please come again.");
                System.exit(0);

            } else if (choiceNum == 2) {
                System.out.println("How much money would you like to withdraw?");
                String amount = scanner.nextLine();
                int amountNum = Integer.valueOf(amount);
                if (amountNum > balance) {
                    System.out.println("Your Account currently only has $" + balance);
            } else if (amountNum <= balance) {
                double newBal = (balance - amountNum);
                System.out.println("Your balance is now $" + newBal);
                System.out.println("Please take your money.");
            }

            }

        }
    }
}