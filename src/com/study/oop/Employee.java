package com.study.oop;

public class Employee {
    private String name;
    private double daySalary;
    private int day;

    public Employee(String name, double daySalary, int day) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
    }

    public void showSalary(){
        System.out.println(name+"的工资是"+daySalary*day+"元");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
