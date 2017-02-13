package com.novauc;

import java.awt.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import java.security.MessageDigest;

/**
 * Created by vtcurry on 2/9/17.
 */
public class users {
    /**
     * The first name of the user.
     */
    private String firstName;
    /**
     * The last name of the user.
     */
    private String lastname;
    /**
     * The ID number of the user.
     */
    private String uuid;
    /**
     * The MD5 hash of the user's pin number.
     */
    private byte pinHash[];
    /**
     * The kist of accounts for this user.
     */
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) {

        //set user's name
        this.firstName = firstName;
        this.lastname = lastName;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            SystemTray.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        this.uuid = theBank.getNewUserUUID();

        this.accounts = new ArrayList<Account>();

        System.out.printf("New user %s, %s with ID %s created.\n", lastName,
                firstName, this.uuid);


    }
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }

    public String getUuid() {
        return this.uuid;

    }


}

