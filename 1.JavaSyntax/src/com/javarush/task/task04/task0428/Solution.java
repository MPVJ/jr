package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(aReader.readLine());
        int b = Integer.parseInt(aReader.readLine());
        int c = Integer.parseInt(aReader.readLine());

        int count = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;
        System.out.println(count);
    }
}