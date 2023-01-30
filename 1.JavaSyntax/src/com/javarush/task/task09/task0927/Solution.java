package com.javarush.task.task09.task0927;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            //Cat cat = new Cat("cat"+i);
            //String cat
            catMap.put("cat"+i, new Cat("cat"+i));
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set set = new HashSet<>();
        //map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4;
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            //set.add(pair.getKey());
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
