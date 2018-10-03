package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine().
                replace(" ", "");
        String vowel = "";
        String consonant = "";

        for (Character ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowel += ch + " ";
            } else {
                consonant += ch + " ";
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}