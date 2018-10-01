package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        String aString = aReader.readLine();
        int n = Integer.parseInt(aReader.readLine());

        int i = 1;
        while (i <= n)
        {
            System.out.println(aString);
            i++;
        }

    }
}