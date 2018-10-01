package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        int max = b;
        if (a >= b ) {
            max = a;
        }
        if (c >= a && c >= b) {
            max = c;
        }
        if (d >= c && d >= a) {
            max = d;
        }
        System.out.println(max);
    }
}