package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int a = Integer.parseInt(bufread.readLine());
        int b = Integer.parseInt(bufread.readLine());
        int c = Integer.parseInt(bufread.readLine());
        int d = Integer.parseInt(bufread.readLine());
        int e = Integer.parseInt(bufread.readLine());
        int[] arr = { a, b, c, d, e};
        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + "\n");
        }
    }
}
