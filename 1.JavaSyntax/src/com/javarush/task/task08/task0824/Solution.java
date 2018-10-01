package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ch1 = new Human("Ребенок1", false, 10);
        Human ch2 = new Human("Ребенок2", true, 11);
        Human ch3 = new Human("Ребенок3", false, 12);
        ArrayList<Human> children = new ArrayList<>();
        children.add(ch1);
        children.add(ch2);
        children.add(ch3);

        Human father = new Human("Отец",true, 35, children);
        Human mother = new Human("Мать",false, 34, children);

        ArrayList<Human> fatherList = new ArrayList<>();
        fatherList.add(father);
        ArrayList<Human> motherList = new ArrayList<>();
        motherList.add(mother);

        Human grandfather1 = new Human("Дед1",true, 78, fatherList);
        Human grandfather2 = new Human("Дед2",true, 75, motherList);
        Human grandmother1 = new Human("Бабушка1",false, 77, fatherList);
        Human grandmother2 = new Human("Бабушка2",false, 74, motherList);
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }
    public static class Human {
        //напишите тут ваш код
        public String name;
        public Boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children == null)
                return text;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}