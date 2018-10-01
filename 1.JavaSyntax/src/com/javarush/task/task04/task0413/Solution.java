package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int day = Integer.parseInt(r.readLine());
        String d;
        switch (day) {
            case 1: d = "понедельник";
                    break;
            case 2: d = "вторник";
                    break;
            case 3: d = "среда";
                    break;
            case 4: d = "четверг";
                    break;
            case 5: d = "пятница";
                    break;
            case 6: d = "суббота";
                    break;
            case 7: d = "воскресенье";
                    break;
            default: d = "такого дня недели не существует";
                    break;
        }

        System.out.println(d);
    }
}