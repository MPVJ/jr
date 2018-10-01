package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> aList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aList.add(aReader.readLine());
        }

        ArrayList<String> result = doubleValues(aList);

        // Вывести на экран result
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.add(++i, s);
        }
        return list;
    }
}