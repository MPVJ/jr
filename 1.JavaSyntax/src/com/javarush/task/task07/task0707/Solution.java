package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        aList.add("four");
        aList.add("five");
        System.out.println(aList.size());
        for (String object: aList) {
            System.out.println(object);
        }
    }
}