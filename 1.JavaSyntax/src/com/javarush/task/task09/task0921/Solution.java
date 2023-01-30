package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            try {
                int number = Integer.parseInt(bufread.readLine());
                numbers.add(number);
            } catch (NumberFormatException e) {
                numbers.forEach(System.out::println);
                break;
            } catch (IOException e) {
                numbers.forEach(System.out::println);
                break;
            }
        }
    }
}
