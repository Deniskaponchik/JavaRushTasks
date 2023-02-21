package com.javarush.task.task07.task0721;

//import com.sun.jdi.IntegerValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        //int maximum;
        //int minimum;
        //напишите тут ваш код
        int[] numbers = getInts();
        int minimum = Integer.MAX_VALUE;
        for (int x : numbers) {
            if (x < minimum)
                minimum = x;
        }
        int maximum = Integer.MIN_VALUE;
        for (int y : numbers) {
            if (y > maximum)
                maximum = y;
        }
        System.out.print(maximum + " " + minimum);
    }
    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(bufread.readLine());
        }
        return numbers;
    }
}
