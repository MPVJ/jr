package com.javarush.task.task03.task0317;

/* 
Путь самурая
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        /*String s1 = "65E5";
        String txt1 = String.valueOf(Character.toChars(Integer.parseInt(s1, 16)));
        System.out.print(txt1);
        String s2 = "672C";
        String txt2 = String.valueOf(Character.toChars(Integer.parseInt(s2, 16)));
        System.out.print(txt2);
        String s3 = "8A9E";
        String txt3 = String.valueOf(Character.toChars(Integer.parseInt(s3, 16)));
        System.out.print(txt3);*/

        char a = '\u65E5';
        char b = '\u672C';
        char c = '\u8A9E';
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}