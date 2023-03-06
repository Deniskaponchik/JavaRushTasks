package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Модернизация ПО*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*
        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }
        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        } */
        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty() || city.equals(" ")) {
                //System.out.println("break");
                break;
            }
            String family1 = reader.readLine();
            map.put(city, family1);
        }
        String city2 = reader.readLine();
        System.out.println(map.get(city2));
    }
}
