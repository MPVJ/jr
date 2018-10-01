package com.javarush.task.task04.task0412;

/*
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt( r.readLine() );
        if (val > 0)
            System.out.println(val * 2);
        if (val < 0)
            System.out.println(val + 1);
        if (val == 0)
            System.out.println(val);
    }

}