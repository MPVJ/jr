package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String space = " ";
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        System.out.println( max(max(a,b),c) + space + mid(a,b,c) + space + min(min(a,b),c) );
    }

    private static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    private static int mid(int a, int b, int c) {
        if ((a <= b) && (a >= c) || (a <= c) && (a >= b)) return a;
        else if ((b <= a) && (b >= c) || (b <= c) && (b >= a)) return b;
        else return c;
    }

    private static int min (int a, int b) {
        if (a < b)
            return a;
        else return b;
    }

}