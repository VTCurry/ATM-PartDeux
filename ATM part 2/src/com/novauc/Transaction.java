package com.novauc;

import java.util.Date;

/**
 * Created by vtcurry on 2/13/17.
 */
public class Transaction {

    private double amount;

    private Date timestampl;

    private String memo;

    private Account inAccount;

    public  Transaction (double amount, Account inAccount) {

        this.amount = amount;
        this.inAccount = inAccount;
        this.timestampl = new Date();
        this.memo = "";

    }

    public Transaction(double amount, String memo, Account inAccount) {

        //call the two-ara constructor first
        this(amount, inaccount);

        // set the memo
        this.memo = memo;
    }
}
