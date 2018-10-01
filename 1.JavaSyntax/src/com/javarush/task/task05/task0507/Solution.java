package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
*/
        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        int value = 0;
        int counter = 0;

        for (; true; )
        {
            value = Integer.parseInt(aReader.readLine());
            if (value != -1)
            {
                sum = sum + value;
                counter++;
            }

            else if (value == -1)
            {
                System.out.println(sum / counter);
                break;
            }
        }
    }
}