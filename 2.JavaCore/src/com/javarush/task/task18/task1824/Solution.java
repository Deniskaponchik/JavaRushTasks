package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while(true){
            fileName = consoleReader.readLine();
            try (BufferedReader bufread = new BufferedReader(new FileReader(fileName));) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }

    }
}
