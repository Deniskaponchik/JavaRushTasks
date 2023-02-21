package com.javarush.task.task07.task0724;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human bob = new Human("Bob", true, 18);
        Human tom = new Human("Tom", true, 10);
        Human kat = new Human("Kat", false, 18);
        Human jes = new Human("Jes", false, 10);

        Human ett = new Human("Ett", true, 68, bob, kat);
        Human fgh = new Human("Fgh", true, 25, bob, kat);
        Human vbn = new Human("Vbn", true, 37, bob, kat);
        Human qwe = new Human("Qwe", false, 48, tom, jes);
        Human yui = new Human("Yui", false, 80, tom, jes);

        System.out.println(bob);
        System.out.println(tom);
        System.out.println(kat);
        System.out.println(jes);

        System.out.println(ett);
        System.out.println(fgh);
        System.out.println(vbn);
        System.out.println(qwe);
        System.out.println(yui);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name; this.sex = sex; this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name; this.sex = sex; this.age = age; this.father = father; this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}