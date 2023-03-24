package com.javarush.task.task22.task2205;

/* 
МНЕ нравится курс JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //System.out.println(String.format("%3$S %4$s %2$s %1$s", "JavaRush", "курс", "мне", "нравится"));
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {

        return "%3$2S %4$2s %2$2s %1$2s";
    }
}
