package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        /*
        int cat1 = 0;
        int cat2 = 0;
        this.age > anotherCat.age ? cat1++ : cat2++;
        this.weight > anotherCat.weight ? cat1++ : cat2++;
        this.strength > anotherCat.strength ? cat1++ : cat2++;
        return cat1 > cat2 ? true : false;  */

        /* int score = 0;
        score =+ Integer.compare(this.age, anotherCat.age);
        score =+ Integer.compare(this.weight, anotherCat.weight);
        score =+ Integer.compare(this.strength, anotherCat.strength);
        return score > 0; //? true : false; */

        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);
        int score = ageScore + weightScore + strengthScore;
        return score > 0;

    }

    public static void main(String[] args) {

    }
}
