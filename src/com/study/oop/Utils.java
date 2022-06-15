package com.study.oop;

public class Utils {

    //冒泡排序按年龄
    public void bubbleSortByAge(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                Person temp;
                int left = arr[j].getAge();
                int right = arr[j + 1].getAge();
                if (left > right) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
