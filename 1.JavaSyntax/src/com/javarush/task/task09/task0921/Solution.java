package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> aList = new ArrayList<>();

        try {
            while (true) {
                aList.add(Integer.parseInt(br.readLine()));
            }
        } catch (Exception e) {
            for (Integer x : aList) {
                System.out.println(x);
            }
        }
    }
}