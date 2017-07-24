package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }




    public boolean equals(Object o) {

        Solution n = (Solution) o;
        if(n.first == first && n.last == last) return true;
        if (o instanceof Solution) return true;
        if(n.first.equals(first) && n.last.equals(last)) return true;
        return false;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        Solution n = new Solution("Mickey", "Mouse");
        System.out.println(s.contains(n));
    }
}
