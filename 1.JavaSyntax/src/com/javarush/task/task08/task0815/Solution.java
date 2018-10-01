package com.javarush.task.task08.task0815;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* Перепись населения */
public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Жел", "Бере");
        map.put("Ниге", "Бере");
        map.put("Нэт", "Ого");
        map.put("Чё", "Там");
        map.put("Тама", "Что");
        map.put("Как", "Так");
        map.put("Ауе", "Ниго");
        map.put("Адын", "Два");
        map.put("Кач", "Вотак");
        map.put("Корак", "Жуяк");
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<String> iterator = map.values().iterator();

        while(iterator.hasNext()) {
            if (name.equals(iterator.next())) {
                count++;
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        return map.containsKey(lastName)?1:0;
    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(), "Бере"));
    }
}