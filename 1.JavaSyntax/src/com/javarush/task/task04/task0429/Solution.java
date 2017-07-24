package com.javarush.task.task04.task0429;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
«количество отрицательных чисел: а», «количество положительных чисел: б»,
где а, б — искомые значения.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPlus = 0;
        int countMinus = 0;

        if (a > 0)
        countPlus = countPlus + 1;
        else if (a < 0)
        countMinus = countMinus + 1;
        if (b > 0)
        countPlus = countPlus + 1;
        else if (b < 0)
        countMinus = countMinus + 1;
        if (c > 0)
        countPlus = countPlus + 1;
        else if (c < 0)
        countMinus = countMinus + 1;
        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);




    }
}
