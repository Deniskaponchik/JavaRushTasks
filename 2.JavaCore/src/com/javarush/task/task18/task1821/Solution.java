package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        //HashMap<Character, Integer> hasha = new HashMap<>();
        //ArrayList<Integer> arrInt = new ArrayList<>();
        int[] arInt = new int[128];


        //String line;
        //int numb;
        try (BufferedReader bufread = new BufferedReader(new FileReader(args[0]))) {
            //while ((line = bufread.readLine()) != null) {
            //while ((numb = bufread.read()) > 0) {
            while (bufread.ready()) {
            //while (bufread.read()!=-1) {
                arInt[bufread.read()]++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        for (int i = 0; i < arInt.length; i++) {
            if(arInt[i] != 0){
                System.out.println((char) i + " " + arInt[i]);
                /*
                if(i == 0) System.out.println("'0'=" + arInt[i]);
                     else if(i == 1) System.out.println("'1'=" + arInt[i]);
                     else if(i == 2) System.out.println("'2'=" + arInt[i]);
                     else if(i == 3) System.out.println("'3'=" + arInt[i]);
                 */
            }
        }
        /*
        for (Integer str : arInt) {
            if(str > 0) {
                if(arInt)
            }
        }*/

    }
}
