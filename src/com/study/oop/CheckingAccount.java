package com.study.oop;

public class CheckingAccount extends BankAccount {
    private double commission = 1;

    public CheckingAccount(double initialBanlance) {
        super(initialBanlance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - commission);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + commission);
    }
}
