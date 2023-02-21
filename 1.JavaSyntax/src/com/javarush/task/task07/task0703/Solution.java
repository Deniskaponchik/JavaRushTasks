package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = bufread.readLine();
        }

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = strings[i].length();
            System.out.println(numbers[i]);
        }




    }
}
