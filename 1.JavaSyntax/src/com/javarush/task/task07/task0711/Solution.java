package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            aList.add(aReader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = aList.get(4);
            aList.remove(4);
            aList.add(0, s);
        }
        for (String object: aList) {
            System.out.println(object);
        }
    }
}