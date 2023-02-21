package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(bufread.readLine()));
        }

        //Collections.sort(numbers);
        Collections.reverse(numbers);

        //for (int i = numbers.size() - 1; i == 0; i--) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
