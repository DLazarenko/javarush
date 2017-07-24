package com.javarush.task.task04.task0428;

/* 
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count = 0;

        if (a > 0)
            count = count + 1;
        if (b > 0)
            count = count + 1;
        if (c > 0)
            count = count + 1;
        System.out.println(count);


    }
}
