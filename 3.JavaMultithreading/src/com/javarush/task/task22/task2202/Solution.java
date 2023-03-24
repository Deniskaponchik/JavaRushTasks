package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new com.javarush.task.task22.task2202.Solution.TooShortStringException();
        }
        String[] splitWithSpaces = string.split(" ");

        if (splitWithSpaces.length < 5) throw new com.javarush.task.task22.task2202.Solution.TooShortStringException();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            stringBuilder.append(splitWithSpaces[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
