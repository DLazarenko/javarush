package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String >();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
            int k = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (k > list.get(i).length()) {
                System.out.println(i);
                break;
            } else {
                k = list.get(i).length();
            }
        }

    }
}

