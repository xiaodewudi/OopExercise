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
        System.out.println(teacher.introduce());
        //第三题，通过继承实现员工工资核算打印功能
        //父类员工类，子类经理类，员工类
        //部门经理工资=1000+单日工资*天数*等级（1.2）
        //普通员工工资=单日工资*天数*等级（1.0）
        //员工属性，姓名，日工资，工作天数，方法打印工资
        //子类重写打印方法，定义初始化2种对象打印工资
        Employee e1=new Manager("sam",300,20);
        Employee e2=new Staff("july",200,20);
        e1.showSalary();
        e2.showSalary();
        //第四题，扩展BankAccount类
        //扩展新类CheckingAccount，对每次存款和取款都收1美元手续费
        //扩展新类SavingAccount，每个月有利息产生，earnMonthlyInterest，每月三次免手续费的存款或取款，并在方法中重置交易次数
        BankAccount ba= new BankAccount(10000);
        ba.deposit(1000);
        ba.deposit(1000);
        ba.withdraw(500);
        ba.withdraw(500);
        System.out.println(ba.getBanlance());
        //第五题，设计一个point类，X,Y坐标通过构造器提供
        //提供一个子类LabeledPoint，构造器接受一个X,Y和标签值
        Point p=new LabeledPoint("坐标A",512,222);
        System.out.println(p);
        //编写doctor类，name，age，gender，job，sal，getset方法，5个参数构造器
        //重写父类equals方法，判断两个对象是否相等
        Doctor d1 = new Doctor("AA",20,"男","nurse",5000);
        Doctor d2 = new Doctor("AA",21,"男","nurse",5000);
        System.out.println(d1.equals(d2));
        //
    }
}

