package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(integer -> integer > 10);
        return set;
    }



    public static void main(String[] args) {
        //System.out.println(numbers);
    }
}
