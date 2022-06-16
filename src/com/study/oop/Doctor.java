package com.study.oop;

import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private String gender;
    private String job;
    private double sal;

    public Doctor(String name, int age, String gender, String job, double sal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        //如果传入同一个对象返回true
        if (this == o) return true;
        //如果对象为空，或者两个对象类型不同，返回false
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型，比较2个对象所有属性值
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Double.compare(doctor.sal, sal) == 0 && name.equals(doctor.name)
                && gender.equals(doctor.gender) && job.equals(doctor.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, job, sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
