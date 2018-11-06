package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    //Напишите тут ваши методы
    public static int max(int firstValue, int secondValue) {
        int max = 0;
        if (firstValue > secondValue) max = firstValue;
        if (secondValue > firstValue) max = secondValue;
        return max;
    }
    public static long max(long firstValue, long secondValue) {
        long max = 0;
        if (firstValue > secondValue) max = firstValue;
        if (secondValue > firstValue) max = secondValue;
        return max;
    }
    public static double max(double firstValue, double secondValue) {
        double max = 0;
        if (firstValue > secondValue) max = firstValue;
        if (secondValue > firstValue) max = secondValue;
        return max;
    }
}
