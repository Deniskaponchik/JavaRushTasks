package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInputStream;
        try {
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        catch (IOException e) {
            System.out.println("Файл не существует.");
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
        /*
        int i = 1;
        while (i > 0) {
            String sourceFileName = reader.readLine();
            //try {InputStream fileInputStream = getInputStream(sourceFileName);
            try (InputStream fileInputStream = getInputStream(sourceFileName)) {
                String destinationFileName = reader.readLine();
                OutputStream fileOutputStream = getOutputStream(destinationFileName);
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                //fileInputStream.close();
                //fileOutputStream.close();
            }
            //else {
            catch (IOException e) {
                System.out.println("Файл не существует.");
                i--;
            }
        } */
        /*
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
        */
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

