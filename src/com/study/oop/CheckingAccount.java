package com.study.oop;

public class CheckingAccount extends SavingAccount {
    private double commission = 1;

    public CheckingAccount() {
    }

    public CheckingAccount(double initialBanlance, int dealCounts, double commission) {
        super(initialBanlance, dealCounts);
        this.commission = commission;
    }


    public double checkAmount(double balance) {
        if (super.getDealCounts() <= 3) {
            super.setDealCounts(super.getDealCounts() + 1);
            return balance;
        } else {
            return balance -= commission;
        }
    }
}
