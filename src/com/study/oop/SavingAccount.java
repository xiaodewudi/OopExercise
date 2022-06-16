package com.study.oop;

public class SavingAccount extends BankAccount {
    private int dealCounts = 1;
    private double rate = 0.01;

    public SavingAccount(double initialBanlance) {
        super(initialBanlance);
    }

    public void earnMonthlyInterest() {
        super.deposit(super.getBanlance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if (dealCounts <= 3) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        dealCounts++;
    }

    @Override
    public void withdraw(double amount) {
        if (dealCounts <= 3) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        dealCounts++;
    }
}
