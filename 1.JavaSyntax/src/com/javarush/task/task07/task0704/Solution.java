package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        int[] aNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            aNumbers[i] = Integer.parseInt(aReader.readLine());
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(aNumbers[i]);
        }
    }
}