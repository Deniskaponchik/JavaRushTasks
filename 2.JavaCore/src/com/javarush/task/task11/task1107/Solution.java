package com.javarush.task.task11.task1107;

/* 
Наш кот слишком публичен!
*/

public class Solution {
    public void main(String[] args) {
        Cat vaska = new Cat("vaska", 9, 4);
        System.out.println(vaska.getAge());
        System.out.println(vaska.getAge());


    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}