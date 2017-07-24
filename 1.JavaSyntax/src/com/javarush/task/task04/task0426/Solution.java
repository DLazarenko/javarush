package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num1 = Integer.parseInt(number);

        if (num1 == 0)
        {
            System.out.println("нулевое число");
        }
        if ((num1<0) && !(num1%2==0))
        {
            System.out.println("отрицательное нечетное число");
        }
        if ((num1<0) && (num1%2==0))
        {
            System.out.println("отрицательное четное число");
        }
        if ((num1>0) && !(num1%2==0))
        {
            System.out.println("положительное нечетное число");
        }
        if ((num1>0) && (num1%2==0))
        {
            System.out.println("положительное четное число");
        }


    }
}
