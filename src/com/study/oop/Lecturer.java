package com.study.oop;

public class Lecturer extends Teacher {
    private double level = 1.1;

    public Lecturer(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level = level;
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
