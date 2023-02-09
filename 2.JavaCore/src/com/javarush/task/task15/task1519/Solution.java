package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException {
        //напиште тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String string1 = bufread.readLine();
            if (string1.contains("exit")) break;
            if (string1.contains(".")) {
                try {
                    Double double1 = Double.parseDouble(string1);
                    print(double1);
                    continue;
                } catch (NumberFormatException e) {}
            }

            try {
                //Integer.parseInt(string1);
                //Integer.parseInt(string1) > 0 && Integer.parseInt(string1) < 128
                if (Integer.parseInt(string1) > 0 && Integer.parseInt(string1) < 128) {
                    Short short1 = Short.parseShort(string1);
                    print(short1);
                    continue;
                }
                //else if (Integer.parseInt(string1) <= 0 && Integer.parseInt(string1) >= 128) {
                else {
                    int integer1 = Integer.parseInt(string1);
                    print(integer1);
                    continue;
                }
            } catch (NumberFormatException e){}

            print(string1);
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
