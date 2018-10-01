package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(aReader.readLine());

        if (num >= 1 && num <= 999)
        {
            if (num % 2 == 0 && num < 10 ) System.out.println("четное однозначное число");
            if (num % 2 != 0 && num < 10 ) System.out.println("нечетное однозначное число");
            if (num % 2 == 0 && num >= 10 && num < 100 )
                System.out.println("четное двузначное число");
            if (num % 2 != 0 && num >= 10 && num < 100 )
                System.out.println("нечетное двузначное число");
            if (num % 2 == 0 && num >= 100 && num <= 999)
                System.out.println("четное трехзначное число");
            if (num % 2 != 0 && num >= 100 && num <= 999)
                System.out.println("нечетное трехзначное число");
        }

    }
}