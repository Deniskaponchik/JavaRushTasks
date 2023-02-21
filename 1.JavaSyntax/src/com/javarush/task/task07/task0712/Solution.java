package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        int maxStringsLenght = 0;
        int maxStringsNumber = 0;
        int minStringsLenght = 0;
        int minStringsNumber = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            //String var = "";
            String var = strings.get(4);
            strings.remove(4);
            strings.add(0, var);
        }

        for (String x : strings) {
            System.out.println(x);
        }
    }
}
