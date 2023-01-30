package com.javarush.task.task13.task1318;
import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String path = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        String path = reader.readLine();
        reader.close();

        //FileInputStream file = new FileInputStream(path);
        InputStream inStream = new FileInputStream(path);
        BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));
        while (bif.ready()) {
            System.out.println(bif.readLine());
        }
        inStream.close();
        bif.close();



        /*
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        //String path = "D:/Work PC/1/txt.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        //Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        */


    }
}