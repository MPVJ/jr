package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        double min = Double.parseDouble(r.readLine());
        double res = (min % 5);
        if (res < 3)
            System.out.println("зелёный");
        else if (res >= 3 && res < 4)
            System.out.println("жёлтый");
        else System.out.println("красный");
    }
}