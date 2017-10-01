package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*

*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);

        final int mediana = array[(int)(array.length / 2)];

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o2 - mediana) - Math.abs(o1 - mediana);
            }
        };


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list, comp);
        Integer[] rez = list.toArray(new Integer[list.size()]);
        return rez;
    }

}