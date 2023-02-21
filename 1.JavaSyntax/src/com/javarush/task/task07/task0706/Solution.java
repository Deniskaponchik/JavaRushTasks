package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //345 228
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int people1 = 0;
        int people2 = 0;

        int[] numbers15 = new int[15];
        for (int i = 0; i < 15; i++) {
            numbers15[i] = Integer.parseInt(bufread.readLine());
            if ( i % 2 == 0 ) {
                people2 = numbers15[i] + people2;
            }
            else{
                people1 = numbers15[i] + people1;
            }
        }

        if (people1 > people2 ) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if (people1 < people2 ) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }


    }
}
