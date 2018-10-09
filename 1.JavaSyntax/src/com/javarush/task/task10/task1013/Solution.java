package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private String sex;
        private int age;
        private int height;
        private int weight;

        public Human(String name, String lastName, String sex) {
        }
        public Human() {
        }
        public Human(String lastName) {
        }
        public Human(String sex, String name) {
        }
        public Human(String name, int age) {
        }
        public Human(String name, int age, String lastName) {
        }
        public Human(String name, int age, String lastName, int height) {
        }
        public Human(String name, int age, String lastName, int height, int weight) {
        }
        public Human(int age, String lastName, int height) {
        }
        public Human(int age, String sex, int height, int weight) {
        }
    }
}