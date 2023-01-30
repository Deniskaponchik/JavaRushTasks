package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);

    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrays = new ArrayList<>();
        int[] array5 = new int[5];
        int[] array2 = new int[2];
        int[] array4 = new int[4];
        int[] array7 = new int[7];
        int[] array0 = new int[0];

        arrays.add(array5);
        arrays.add(array2);
        arrays.add(array4);
        arrays.add(array7);
        arrays.add(array0);

        return arrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
