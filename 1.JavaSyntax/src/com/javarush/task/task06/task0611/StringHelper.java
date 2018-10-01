package com.javarush.task.task06.task0611;

/*
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            buf.append(s);
        }
        result = buf.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(s);
        }
        result = buf.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("f"));
        System.out.println(multiply("f", 2));
    }
}