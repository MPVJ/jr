package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();

        aList.add("мама");
        aList.add("мыла");
        aList.add("раму");

        for (int i = 0; i < aList.size(); i=i+2) {
            aList.add(i + 1,"именно");
        }

        for (String x : aList) {
            System.out.println(x);
        }
    }
}