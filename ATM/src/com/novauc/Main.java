package com.novauc;
import java.util.HashMap;
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

            String name = scanner.nextLine();
            if (name.length() == 0) {
                throw new Exception("Not a valid name.");
            } else {
                if (!accounts.containsKey(name)) {
                    System.out.println("How can we help you? " + name);
                }
                double balance = accounts.get(name);
                System.out.println("[1] Check my balance");
                System.out.println("[2] Withdraw Funds");
                System.out.println("[3] Cancel");
                String choice = scanner.nextLine();
                int choiceNum = Integer.valueOf(choice);
                if (choiceNum == 1) {
                    System.out.println("Your balance is $" + balance);

                } else if (choiceNum == 3) {
                    System.out.println("Thank you and please come again.");
                    System.exit(0);

                } else if (choiceNum == 2) {
                    System.out.println("How much money would you like to withdraw?");
                    String amount = scanner.nextLine();
                    int amountNum = Integer.valueOf(amount);
                    if (amountNum > balance) {
                        System.out.println("ATM currently only has $" + balance);
                        continue;
                    } else if (amountNum <= balance) {
                        double newBal = (balance - amountNum);
                        accounts.put(name, newBal);
                        System.out.println("Your balance is now $" + (balance - amountNum));
                        System.out.println("Please take your money.");
                    }

                }
            }
        }
    }