package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("asd", "qwe");
        map.put("asd", "zxc");
        map.put("zxc", "qwe");
        map.put("asd", "qwe");
        map.put("asd", "qwe");

        map.put("asd", "qwe");
        map.put("asd", "qwe");
        map.put("asd", "qwe");
        map.put("asd", "qwe");
        map.put("asd", "qwe");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
