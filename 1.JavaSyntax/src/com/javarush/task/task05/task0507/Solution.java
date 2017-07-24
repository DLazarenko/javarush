package com.javarush.task.task05.task0507;

/* 
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int count = 0;

        while (true){
            int a = Integer.parseInt(reader.readLine());

            if (a != -1){
                number = number + a;
                count = count + 1;
            }
            else {
                double middle = (double) number / count;

                System.out.println(middle);
                break;
            }
        }
    }
}

