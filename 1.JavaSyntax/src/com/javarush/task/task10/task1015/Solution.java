package com.javarush.task.task10.task1015;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[2];

        arrayLists[0] = new ArrayList<String> (Arrays.asList ("Мас1Строка1", "Мас1Строка2"));
        arrayLists[1] = new ArrayList<String> (Arrays.asList ("Мас1Строка1", "Мас1Строка2"));

        return arrayLists;

    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}