package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        /* через текстовый массив
        String numText = bufread.readLine();
        char[] numChar = numText.toCharArray();
        for (int i = 0; i < numText.length(); i++) {
        } */

        int number1 = Integer.parseInt(bufread.readLine());
        while ( number1 != 0) {
            if (number1 % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            number1 = number1 / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
