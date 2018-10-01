package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int row = 1;
        int col = 1;

        while (row < 11)
        {
            while (col < 11)
            {
                System.out.print(row*col + " ");
                col++;
            }

            System.out.println();
            row++;
            col = 1;
        }

    }
}