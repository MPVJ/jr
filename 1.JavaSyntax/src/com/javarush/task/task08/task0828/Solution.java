package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> monthList = new ArrayList<>(Arrays.asList(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
                ));

        String inputString = aReader.readLine();
        int index = monthList.indexOf(inputString);
        if (index < 0)
            return;

        System.out.printf("%s is the %d month\n", monthList.get(index), index + 1);
    }
}
