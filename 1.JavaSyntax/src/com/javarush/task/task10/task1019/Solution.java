package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //HashMap<Integer, String> map = new HashMap<Integer, String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                //map.put(id, name);
                map.put(name, id);
            }
            catch (Exception e) {
                for (Map.Entry<String, Integer> pair : map.entrySet()) {
                    //pair.getKey() + pair.getValue();
                    //System.out.println("Id=" + pair.getKey() + " Name=" + pair.getValue());
                    //System.out.println(pair.getKey() + " " + pair.getValue());
                    System.out.println(pair.getValue() + " " + pair.getKey());
                }
                break;
            }
        }

        /*
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            //pair.getKey() + pair.getValue();
            System.out.println("Id=" + pair.getKey() + " Name=" + pair.getValue());
        } */

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
