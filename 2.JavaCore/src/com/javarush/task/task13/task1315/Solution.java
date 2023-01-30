package com.javarush.task.task13.task1315;

public class Solution {
    public static void main(String[] args) {  }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public static class Cat implements Movable, Edible, Eat {
        public void move(){};
        public void beEaten(){ };
        public void eat(){};
    }
    public static class Mouse implements Movable, Edible {
        public void move(){};
        public void beEaten(){ };
    }
    public static class Dog implements Movable, Eat {
        public void move(){};
        public void eat(){};
    }





}