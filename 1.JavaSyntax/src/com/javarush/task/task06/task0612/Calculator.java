package com.javarush.task.task06.task0612;

/* 
int plus(int a, int b) – возвращает сумму чисел a и b
int minus(int a, int b) – возвращает разницу чисел a и b
int multiply(int a, int b) – возвращает результат умножения числа a на число b
double division(int a, int b) – возвращает результат деления числа a на число b
double percent(int a, int b) – возвращает процент b из числа a
*/

public class Calculator {
    public static int plus(int a, int b) {
        int c = a + b;

        return c;
    }

    public static int minus(int a, int b) {
        int c = a - b;

        return c;
    }

    public static int multiply(int a, int b) {
        int c = a * b;

        return c;

    }

    public static double division(int a, int b) {
        double c = (double)a / b;

        return c;
    }

    public static double percent(int a, int b) {
        double c = (double)a / 100 * b;

        return c;
    }

    public static void main(String[] args) {


    }
}