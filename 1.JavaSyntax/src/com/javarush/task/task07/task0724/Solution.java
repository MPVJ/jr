package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human firstHuman = new Human("Первый", true, 32);
        Human secondHuman = new Human("Второй", false, 34);
        Human thirdHuman = new Human("Третий", true, 46);
        Human fourthHuman = new Human("Четвертый", false, 38);
        Human fifthHuman = new Human("Пятый", true, 14, firstHuman, secondHuman);
        Human sixthHuman = new Human("Шестой", true, 12, firstHuman, secondHuman);
        Human seventhHuman = new Human("Седьмой", false, 10, thirdHuman, fourthHuman);
        Human eighthHuman = new Human("Восьмой", false, 12, thirdHuman, fourthHuman);
        Human ninthHuman = new Human("Девятый", false, 14, thirdHuman, fourthHuman);
        System.out.println(firstHuman.toString());
        System.out.println(secondHuman.toString());
        System.out.println(thirdHuman.toString());
        System.out.println(fourthHuman.toString());
        System.out.println(fifthHuman.toString());
        System.out.println(sixthHuman.toString());
        System.out.println(seventhHuman.toString());
        System.out.println(eighthHuman.toString());
        System.out.println(ninthHuman.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}