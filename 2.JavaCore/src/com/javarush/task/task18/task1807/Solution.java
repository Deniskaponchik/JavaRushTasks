package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* Подсчет запятых*/

public class Solution {
    public static void main(String[] args) throws IOException {

        //‪D:\Work PC\1\Удалить\Java\str1.txt

        //BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = bufread.readLine();
        //FileInputStream inputStream = new FileInputStream(fileName);
        FileInputStream fis = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());


        int count = 0;
        while (fis.available() > 0) {
            //fis.
            if (fis.read() == 44) {
                count++;
            }
        }
        fis.close();
        System.out.println(count);

    }
}
