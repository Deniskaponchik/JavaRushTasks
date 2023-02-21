package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufread.readLine());
        }

        for (int i = 1; i < list.size(); i++ ) {
            //Сравниваем 1 элемент списка с нулевым и так далее
            if ( list.get(i).length() < list.get(i - 1).length() ) {
                System.out.println(i);
                break;
            }
        }
    }
}

