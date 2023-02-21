package com.javarush.task.task05.task0532;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufread.readLine());
        //int[] numbers[] = {};
        //напишите тут ваш код
        if ( N > 0 ) {
            int maximum = Integer.MIN_VALUE;
            for (int i = 1; i <= N; i++) {
                int number = Integer.parseInt(bufread.readLine());
                maximum = number > maximum ? number : maximum;
            }
            System.out.println(maximum);
        }
    }
}
