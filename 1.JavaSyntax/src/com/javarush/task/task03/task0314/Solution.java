package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a, c, b = 1;
        while (b <= 10) {
            a = 1;
            while (a <= 10) {
                c = (a * b);
                System.out.print(c + " ");
                a++;
            }
            b++;
            System.out.println(" ");
        }
    }
}