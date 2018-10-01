package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(aReader.readLine());
        int b = Integer.parseInt(aReader.readLine());
        int c = Integer.parseInt(aReader.readLine());

        if (a != b || a != c)
        {
            if (a == b) System.out.println(3);
            if (b == c) System.out.println(1);
            if (a == c) System.out.println(2);
        }
    }
}