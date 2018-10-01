package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            aList.add(aReader.readLine());
        }
        for (int i = 1; i < aList.size(); i++) {
            if (aList.get(i).length() < aList.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}