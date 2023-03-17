package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = consoleReader.readLine();
        String fileName2 = consoleReader.readLine();


        int count = 0;

        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        ){
            while (fileReader.ready()) {
                /*
                if(count++ % 2 == 0)
                    fileWriter.write(fileReader.read());
                */
                fileReader.read();
                fileWriter.write(fileReader.read());


            }
        }
    }
}
