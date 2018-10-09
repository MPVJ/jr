package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> aMap = new HashMap<>();

        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                aMap.put(name, number);
            }
        } catch (NumberFormatException e) {

        }

        for (Map.Entry<String, Integer> pair : aMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}