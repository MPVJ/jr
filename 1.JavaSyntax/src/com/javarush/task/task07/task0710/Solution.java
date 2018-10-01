package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            aList.add(0, aReader.readLine());
        }
        for (String object:
             aList) {
            System.out.println(object);
        }
    }
}