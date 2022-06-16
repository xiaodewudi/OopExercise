package com.study.oop;

public class Manager extends Employee {
    private double level = 1.2;

    public Manager(String name, double daySalary, int day) {
        super(name, daySalary, day);
    }

    @Override
    public void showSalary() {
        System.out.println(getName()+"的工资是"+getDaySalary()*getDay()*level);
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
