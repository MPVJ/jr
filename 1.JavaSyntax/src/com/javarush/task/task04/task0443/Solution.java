package com.javarush.task.task04.task0443;


/*
Как назвали, так назвали
*/

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        String aName = aReader.readLine();
        int year = Integer.parseInt(aReader.readLine());
        int month = Integer.parseInt(aReader.readLine());
        int day = Integer.parseInt(aReader.readLine());

        System.out.println("Меня зовут " + aName + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}