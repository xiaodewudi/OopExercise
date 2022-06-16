package com.study.oop;

public class BankAccount {
    private double banlance;

    public BankAccount(){}
    public BankAccount(double initialBanlance) {
        this.banlance = initialBanlance;
    }

    public void deposit(double amount) {
        banlance += amount;
        CheckingAccount c = new CheckingAccount();
        banlance = c.checkAmount(banlance);
    }

    public void withdraw(double amount) {
        banlance -= amount;
        CheckingAccount c = new CheckingAccount();
        banlance = c.checkAmount(banlance);
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
}
