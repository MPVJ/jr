package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int num  = Integer.parseInt(aReader.readLine());

        if (num % 2 == 0 && num < 0) System.out.println("отрицательное четное число");
        if (num % 2 != 0 && num < 0) System.out.println("отрицательное нечетное число");
        if (num == 0 ) System.out.println("ноль");
        if (num % 2 == 0 && num > 0) System.out.println("положительное четное число");
        if (num % 2 != 0 && num > 0) System.out.println("положительное нечетное число");
    }
}