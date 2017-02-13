package com.novauc;

import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * Created by vtcurry on 2/13/17.
 */
public class Account {
    private String name;

    private String uuid;

    private users holdrt;

    private ArrayList<Transaction> transactions;

    public Account(String name, User holder, Bank theBank) {

        // set the account name and holder
        this.name = name;
        this.holder = holder;

        // get name account UUID
        this.uuid = theBank.getNewAccountUUID();

        // init transactions
        this.transactions = new ArrayList<Transaction>();

    }
    public String getUuid() {
        return this.uuid;
    }
}
