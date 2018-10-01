package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(aReader.readLine());
        int b = Integer.parseInt(aReader.readLine());
        int c = Integer.parseInt(aReader.readLine());

        if ((a<=b && b<=c)||(c<=b && b<=a))
        {
            System.out.println(b);
        }
        else if ((b<=a && a<=c)||(c<=a && a<=b))
        {
            System.out.println(a);
        }
        else System.out.println(c);
    }
}