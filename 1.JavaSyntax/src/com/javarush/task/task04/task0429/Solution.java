package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(aReader.readLine());
        int b = Integer.parseInt(aReader.readLine());
        int c = Integer.parseInt(aReader.readLine());

        int posCount = 0;
        int negCount = 0;

        if (a > 0) posCount++;
        else if (a < 0) negCount++;

        if (b > 0) posCount++;
        else if (b < 0) negCount++;

        if (c > 0) posCount++;
        else if (c < 0) negCount++;

        System.out.println("количество отрицательных чисел: " + negCount);
        System.out.println("количество положительных чисел: " + posCount);

    }
}