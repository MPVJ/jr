package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] five = {51, 52, 53, 54, 55};
        int[] two = {21, 22};
        int[] four = {41, 42, 43, 44};
        int[] seven = {71, 72, 73, 74, 75, 76, 77};
        int[] zero = {};
        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}