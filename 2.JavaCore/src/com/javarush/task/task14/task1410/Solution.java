package com.javarush.task.task14.task1410;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    //который возвращает объект типа Wine.
    public static Drink getDeliciousDrink() {

        return new Wine();
    }

    //возвращает объект типа Wine
    public static Wine getWine() {
        return new Wine();
    }

    //возвращает объект типа SparklingWine
    public static Wine getSparklingWine() {
        return new SparklingWine();
    }
}
