package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* Десять котов*/
public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }
    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> aMap = new HashMap<>();
        aMap.put("Cat1", new Cat("Cat1"));
        aMap.put("Cat2", new Cat("Cat2"));
        aMap.put("Cat3", new Cat("Cat3"));
        aMap.put("Cat4", new Cat("Cat4"));
        aMap.put("Cat5", new Cat("Cat5"));
        aMap.put("Cat6", new Cat("Cat6"));
        aMap.put("Cat7", new Cat("Cat7"));
        aMap.put("Cat8", new Cat("Cat8"));
        aMap.put("Cat9", new Cat("Cat9"));
        aMap.put("Cat10", new Cat("Cat10"));
        return aMap;
    }
    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> aSet = new HashSet<>();
        map.forEach((name, cat) -> aSet.add(cat));
        return aSet;
    }
    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }
    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}