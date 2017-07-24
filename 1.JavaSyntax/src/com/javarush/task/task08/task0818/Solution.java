package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 100);
        map.put("Petrov", 200);
        map.put("Sidorov", 300);
        map.put("Klimov", 400);
        map.put("Tinov", 500);
        map.put("Dyrov", 600);
        map.put("Ohin", 200);
        map.put("Ivanot", 1000);
        map.put("Iva", 2000);
        map.put("Ivav", 3000);
return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair: copy.entrySet())
        {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}