package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        String[] aStrings = new String[10];
        int[] aNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            aStrings[i] = aReader.readLine();
            aNumbers[i] = aStrings[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(aNumbers[i]);
        }
    }
}