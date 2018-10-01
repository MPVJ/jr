package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Нам повторы не нужны */

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("LastName1", "FirstName1");
        map.put("LastName2", "FirstName2");
        map.put("LastName3", "FirstName3");
        map.put("LastName4", "FirstName4");
        map.put("LastName5", "FirstName5");
        map.put("LastName6", "FirstName6");
        map.put("LastName7", "FirstName7");
        map.put("LastName8", "FirstName8");
        map.put("LastName9", "FirstName9");
        map.put("LastName10", "FirstName1");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        String[] names = map.values().toArray(new String[0]);
        HashSet<String> tmp = new HashSet<>();
        for (String s : names) if (!tmp.add(s)) removeItemFromMapByValue(map, s);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}