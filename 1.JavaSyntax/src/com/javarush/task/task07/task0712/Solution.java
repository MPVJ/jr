package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самые-самые
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            aList.add(aReader.readLine());
        }

        int maxLength = aList.get(0).length();
        int indOfMaxLen = 0;
        int minLength = aList.get(0).length();
        int indOfMinLen = 0;

        for (int i = 0; i < 10; i++) {
            if (aList.get(i).length() > maxLength) {
                maxLength = aList.get(i).length();
                indOfMaxLen = i;
            }
            if (aList.get(i).length() < minLength) {
                minLength = aList.get(i).length();
                indOfMinLen = i;
            }
        }
        if (indOfMinLen < indOfMaxLen) {
            System.out.println(aList.get(indOfMinLen));
        } else {
            System.out.println(aList.get(indOfMaxLen));
        }
    }
}