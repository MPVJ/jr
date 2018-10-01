package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<Integer> aList = new ArrayList<>();
        BufferedReader aReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            aList.add(Integer.parseInt(aReader.readLine()));
        }

        int count = 1;
        int result = 1;
        for (int i = 0; i < aList.size() - 1; i++) {
            if (aList.get(i + 1).equals(aList.get(i))) {
                count++;
                if (result < count) result = count;
                } else {
                count = 1;
            }
        }
        System.out.println(result);

    }
}