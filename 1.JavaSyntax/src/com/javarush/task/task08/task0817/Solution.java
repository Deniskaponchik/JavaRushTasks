package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map perepis = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            perepis.put("lastName" + i, "firstName" + i);
        }
        return perepis;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        //Создаём копию вводной map
        Map<String, String> copy = new HashMap<>(map);

        //Для каждой строки/пары скопированной map
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            //Если взятое в паре Value совпадает с переданной в метод строкой
            if (pair.getValue().equals(value)) {
                //удаляем пару/строку в оригинальной map
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
