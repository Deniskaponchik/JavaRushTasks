package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers20 = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers20[i] = Integer.parseInt(bufread.readLine());
        }

        int[] numbers11 = new int[10];
        int[] numbers12 = new int[10];

        //for (int a = 0, b = 9; b < 20; a++, b++) {
        for (int i = 0; i < 20; i++) {
            if(i <= 9) {
                numbers11[i] = numbers20[i];
            }
            if(i > 9){
                int ii = i - 10;
                numbers12[ii] = numbers20[i];
                System.out.println(numbers12[ii]);
            }
        }

    }
}
