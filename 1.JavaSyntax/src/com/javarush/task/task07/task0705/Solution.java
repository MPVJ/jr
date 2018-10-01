package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        int[] aBigArray = new int[20];
        int[] aOneArray = new int[10];
        int[] aTwoArray = new int[10];
        for (int i = 0; i < 20; i++) {
            aBigArray[i] = Integer.parseInt(aReader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            aOneArray[i] = aBigArray[i];
        }
        for (int i = 10; i < 20; i++) {
            aTwoArray[i-10] = aBigArray[i];
            System.out.println(aTwoArray[i-10]);
        }
    }
}