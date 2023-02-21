package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(bufread.readLine());
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

