package com.thoughtworks.accountbalance;

/**
 * Created by Nathan_Zeplowitz on 4/10/15.
 */
public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }
}
