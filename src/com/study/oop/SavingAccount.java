package com.study.oop;

public class SavingAccount extends BankAccount{
    private int dealCounts = 0;

    public SavingAccount() {
    }

    public SavingAccount(double initialBanlance, int dealCounts) {
        super(initialBanlance);
        this.dealCounts = dealCounts;
    }

    public void earnMonthlyInterest(){
        super.setBanlance(super.getBanlance()*1.003);
    }
    public int getDealCounts() {
        return dealCounts;
    }

    public void setDealCounts(int dealCounts) {
        this.dealCounts = dealCounts;
    }
}
