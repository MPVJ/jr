package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date1.setMonth(0);
        date1.setDate(1);

        long a = (date2.getTime() - date1.getTime()) / (3600*24*1000) + 1;
        if (a % 2 != 0) {
            return true;
        }

        return false;
    }
}