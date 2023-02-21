package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map perepis = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            perepis.put("name" + i, "family" + i);
        }
        return perepis;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int nameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if( name.equals(pair.getValue()) )
                nameCount++;
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastNameCount = 0;
        /*
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if( lastName.equals(pair.getKey()) )
                lastNameCount++;} */
        if (map.containsKey(lastName)) ++lastNameCount;
        return lastNameCount;
    }

    public static void main(String[] args) {

    }
}
