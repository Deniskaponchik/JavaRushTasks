package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        String path = bufread.readLine();

        //ArrayList<String> strings = new ArrayList<>();

        //FileOutputStream outputStream = new FileOutputStream(path);
        //BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream);
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        String stroka;
        while (true) {
            stroka = bufread.readLine();
            //strings.add(stroka);
            bw.write(stroka+"\n");
            if (stroka.equals("exit"))
                break;
        }
        bw.close();
    }
}
