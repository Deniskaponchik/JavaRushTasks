package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;

        while (true)
        {
            String s = bufread.readLine();

            if (s.equals("сумма")) {
                System.out.println(summ);
                break;
            }
            else {
                int number = Integer.parseInt(s);
                summ += number;
            }
        }

    }
}
