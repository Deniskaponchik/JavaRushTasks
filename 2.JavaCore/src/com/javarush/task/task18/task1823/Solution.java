package com.javarush.task.task18.task1823;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = bufread.readLine()).equals("exit")){
            new ReadThread(fileName).start();
        }

    }

    public static class ReadThread extends Thread {
        //private String name;
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName= fileName;
            //start();
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            int[] byteArr = new int[256];
            try (BufferedReader bufread = new BufferedReader(new FileReader(fileName));) {
                while (bufread.ready()) {
                    byteArr[bufread.read()]++;
                }

                int maxCountRepeat = 0;
                int maxCountByte = 0;
                for (int i = 0; i < byteArr.length; i++) {
                    if (byteArr[i] > maxCountRepeat) {
                        maxCountRepeat = byteArr[i];
                        maxCountByte = i;
                    }
                }
                resultMap.put(fileName, maxCountByte);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }






    }
}
