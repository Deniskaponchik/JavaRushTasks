package com.javarush.task.task08.task0822;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* Минимальное из N чисел*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        List<Integer> listInteger = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            listInteger.add(Integer.parseInt(reader.readLine()));
        }
        return listInteger;
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        return Collections.min(array);
        //return 0;
    }


}
