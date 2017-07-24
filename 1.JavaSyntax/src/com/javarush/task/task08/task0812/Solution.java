package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/* 
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           list.add(Integer.parseInt(reader.readLine()));
        }
        int max = 0;
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) == list.get(i + 1))
                count++;
            else
                count = 1;

            if (count > max)
                max = count;

            else
                max = 1;
        }
        System.out.println(max);


    }
}