package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {

    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            strings.add("Лола"+ i);
        }
        return strings;
    }

    public static void main(String[] args) {

    }
}
