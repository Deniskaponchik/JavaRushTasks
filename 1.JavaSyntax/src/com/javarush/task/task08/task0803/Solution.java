package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        /*
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < cats.length; i++) {
            String catsName = "cat"+i
            Cat cat = new Cat(cats[i]);
            map.put("first", cat);
        } */

        Map<String, Cat> catMap = new HashMap<String, Cat>();
        for(String x : cats) {
            catMap.put(x, new Cat(x));
        }
        return catMap;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
