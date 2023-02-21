package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufread.readLine());
        }

        /*
        strings.size();
        strings.get(3);
        strings.set(3, s);
        Collections.addAll(strings, "", "", "");
        strings.add("Васька");
        strings.add(15, s);
        strings.remove(3);
        strings.removeIf(s -> (s.contains("р")) && !(s.contains("л")));
        Collections.sort(strings);
        Collections.reverse(strings);
        Collections.shuffle(strings);
        Collections.max(numbers);
        */

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        result.forEach(System.out::println);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i = i+2) {
            list.add(i, list.get(i));
        }


        return list;
    }
}
