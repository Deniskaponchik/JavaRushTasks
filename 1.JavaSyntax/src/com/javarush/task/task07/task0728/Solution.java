package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {System.out.println(x);}
        //for (int i = 19; i >= 0; i--) { System.out.println(array[i]); }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        //array = -Arrays.sort(-array);

        //Integer[] arr = array;
        //Arrays.sort(array, Collections.reverseOrder());

        //Arrays.sort(array);
        //ArrayUtils.reverse(array);

        for (int i = 0; i < array.length; i++){
            array[i] *= -1;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            array[i] *= -1;
        }

    }
}
