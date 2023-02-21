package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        /* MY
        String text = "";
        while ( !text.contains("end") ) {
            text = bufread.readLine();
            if ( !text.contains("end") ) {
                strings.add(text);
            }
        }  */

        for(String s; ; strings.add(s)) {
            s = bufread.readLine();
            if (s.equals("end"))
                break;
        }

        strings.forEach(System.out::println);

    }
}