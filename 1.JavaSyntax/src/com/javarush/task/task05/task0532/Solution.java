package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483640;

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (i == 0) {maximum = a;}
            if (a > maximum) {
                maximum = a;
            }
        }

        System.out.println(maximum);
    }
}