package com.javarush.task.task01.task0132;

/*
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int d1 = (number / 100);
        int d2 = ((number % 100) / 10);
        int d3 = ((number % 100) % 10);

        return d1+d2+d3;
    }
}