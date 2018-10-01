package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(aReader.readLine());
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else if (i % 2 != 0) {
                sumOdd += arr[i];
            }
        }
        if (sumEven > sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        if (sumOdd > sumEven)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}