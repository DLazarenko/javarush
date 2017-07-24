package com.javarush.task.task05.task0515;

/* 
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, char sex, int money, int weight, int size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }



    public static void main(String[] args) {

    }
}
