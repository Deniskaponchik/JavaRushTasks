package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String dollar = reader.readLine();
        int dollars = Integer.parseInt(dollar);
        String year = reader.readLine();
        int years = Integer.parseInt(year);

        System.out.println(name + " получает " + dollars + " через " + years +" лет.");

    }
}
