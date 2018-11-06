package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    //Напишите тут ваши методы
    public static int min(int firstValue, int secondValue) {
        int result = 0;
        if (firstValue < secondValue) result = firstValue;
        if (secondValue < firstValue) result = secondValue;
        return result;
    }
    public static long min(long firstValue, long secondValue) {
        long result = 0;
        if (firstValue < secondValue) result = firstValue;
        if (secondValue < firstValue) result = secondValue;
        return result;
    }
    public static double min(double firstValue, double secondValue) {
        double result = 0;
        if (firstValue < secondValue) result = firstValue;
        if (secondValue < firstValue) result = secondValue;
        return result;
    }
}
