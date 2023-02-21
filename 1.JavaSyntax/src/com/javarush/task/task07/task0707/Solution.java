package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("Vasya"+i);
        }

        System.out.println(strings.size());

        for (int i = 0; i < 5; i++){
            System.out.println(strings.get(i));
        }

    }
}
