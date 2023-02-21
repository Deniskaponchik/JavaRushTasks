package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {

    private static ArrayList<String> strings;


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int stringLenghtMax = 0;

        //ArrayList<String> strings = new ArrayList<>();
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(bufread.readLine());
            if ( strings.get(i).length() > stringLenghtMax ) {
                stringLenghtMax = strings.get(i).length();
            }
        }
        for (String x : strings) {
            if ( x.length() == stringLenghtMax ) {
                System.out.println(x);
            }
        }


    }
}
