package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Смирнов", 497);
        map.put("Иванов", 498);
        map.put("Кузнецов", 499);
        map.put("Соколов", 500);
        map.put("Попов", 501);
        map.put("Лебедев", 502);
        map.put("Новиков", 503);
        map.put("Козлов", 504);
        map.put("Морозов", 505);
        map.put("Петров", 506);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}