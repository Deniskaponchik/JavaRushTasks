package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufread.readLine());
        int m = Integer.parseInt(bufread.readLine());

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(bufread.readLine());
        }

        for (int i = 0; i < m; i++) {
            strings.add(strings.remove(0));
        }

        strings.forEach(System.out::println);

    }
}
