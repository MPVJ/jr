package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        return str.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(i.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader dbl = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(dbl.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader boo = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(boo.readLine());
    }

    public static void main(String[] args) {
    }
}