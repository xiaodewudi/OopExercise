package com.study.oop;

public class AssistantProfessor extends Teacher {
    private double level = 1.2;

    public AssistantProfessor(String name, int age, String post, double salary, double level) {
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
