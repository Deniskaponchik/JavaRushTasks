package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0976, "vaska");
        labels.put(1.09745567566, "vaska");
        labels.put(1.0956756876, "vaska");
        labels.put(1.09898797976, "vaska");
        labels.put(1.096746776, "vaska");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
