package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            aList.add(Integer.parseInt(reader.readLine()));
            Collections.sort(aList);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(aList.get(i));
        }
    }
}