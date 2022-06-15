package com.study.oop;

public class OopExercise {
    public static void main(String[] args) {
        //第一题，定义一个person类name，age，job初始化对象数组，有3个person对象
        //并按照age从大到小排序，使用冒泡
        Person person1 = new Person("mary", 28, "employee");
        Person person2 = new Person("jack", 19, "employee");
        Person person3 = new Person("tom", 24, "employee");
        Person[] persons = {person1, person2, person3};
        new Utils().bubbleSortByAge(persons);
        //打印结果
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

