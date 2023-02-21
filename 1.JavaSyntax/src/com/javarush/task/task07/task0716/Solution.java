package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        //strings.get(i).contains("p") && strings.get(i).contains("л")
        //return null;

        // remove entry if it contains "р" but no "л"
        strings.removeIf(s -> (s.contains("р")) && !(s.contains("л")));
        //strings.removeIf(string.contains("р"))
        // add entry if it contains "л" but no "р"
        strings.addAll(strings.stream()
                .filter(s -> s.contains("л") && !(s.contains("р")))
                .collect(Collectors.toList()));
        return strings;

    }
}