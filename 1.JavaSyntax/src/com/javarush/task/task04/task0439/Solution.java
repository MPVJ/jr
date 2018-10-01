package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        String aName = aReader.readLine();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(aName + " любит меня.");
        }

    }
}