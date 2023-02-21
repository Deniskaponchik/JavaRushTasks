package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "мама", "мыла", "раму");

        for (int i = 0; i < strings.size(); i = i + 2)
            strings.add(i+1, "именно");

        strings.forEach(System.out::println);

    }
}
