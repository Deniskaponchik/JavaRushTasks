package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        for (int i = 0; i < 8; i++) {
            strings[i] = bufread.readLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(strings[i]);
        }


    }
}