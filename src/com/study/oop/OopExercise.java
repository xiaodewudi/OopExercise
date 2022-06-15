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
        //第二题，定义老师类，name，age，post，salary
        //编写业务方法introduce，实现输出一个教师的信息
        //编写3个子类，教授，副教授，讲师，工资级别分别1.3,1.2,1.1，重写introduce
        //定义一个老师对象，调用业务方法打印信息
        Teacher teacher = new Professor("tom", 50, "教授", 20000);
        System.out.println(teacher.introduce());;
    }
}

