package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> aMainList = new ArrayList<>();
        ArrayList<Integer> a3List = new ArrayList<>();
        ArrayList<Integer> a2List = new ArrayList<>();
        ArrayList<Integer> a0List = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            aMainList.add(Integer.parseInt(aReader.readLine()));
        }
        for (int i = 0; i < aMainList.size(); i++) {
            int x = aMainList.get(i);
            if (x % 3 == 0) a3List.add(aMainList.get(i));
            if (x % 2 == 0) a2List.add(aMainList.get(i));
            if (x % 3 != 0 && x % 2 != 0) a0List.add(aMainList.get(i));

        }
        printList(a3List);
        printList(a2List);
        printList(a0List);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer object: list) {
            System.out.println(object);
        }
    }
}