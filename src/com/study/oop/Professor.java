package com.study.oop;

public class Professor extends Teacher {
    private double level = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return super.introduce() + level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
