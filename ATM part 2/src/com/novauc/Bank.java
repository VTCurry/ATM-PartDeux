package com.novauc;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by vtcurry on 2/13/17.
 */
public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account> accounts;

    public String getNewUserUUID() {

        //inits
        String uuid;
        Random rng = new Random();
        int len = 4;
        boolean nonUnique;

        do {

            //generate the number
            uuid = "";
            for (int c = 0; c < len; c++) {
                uuid += ((Integer)rng.nextInt(10)).toString();
            }

            // check to make sure it's unique
            nonUnique = false;
            for (User u : this.users) {
                if (uuid.compareTo(u.getUUIDC()) == 0) {
                    nonUnique = true;
                    break;
                }
            }

        } while (nonUnique);


        return uuid;

    }

    public String getNewAccountUUID() {

        //inits
        String uuid;
        Random rng = new Random();
        int len = 10;
        boolean nonUnique;

        do {

            //generate the number
            uuid = "";
            for (int c = 0; c < len; c++) {
                uuid += ((Integer)rng.nextInt(10)).toString();
            }

            // check to make sure it's unique
            nonUnique = false;
            for (Account a : this.accounts) {
                if (uuid.compareTo(a.getUUIDC()) == 0) {
                    nonUnique = true;
                    break;
                }
            }

        } while (nonUnique);


        return uuid;
    public void addAccount(Account anAcct) {
        this.accounts.add(anAcct);
    }
    }


    public User addUser(String firstName, String lastName, String pin) {

        // create a new User object and add it to our list
        User newUser = new User(firstName, lastName, pin, this);
        this.users.add(newUser);

        //create a savings account for the user and add to User and Bank
        //accounts lists
        Account newAccount = new Account("Savings", newUser, this);
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);

        return newUser;
    }

    public User useLogin(String userID, String.pin) {

        //search through list of users
        for (User u : this.users) {

            // check user ID is correct
            if (u.getUUID().compare(userID) == 0 && u.validatePin(pin)) {
                return u:
            }
        }

        // if we haven't found the user or have an incorrect pin return null;
    }

}


