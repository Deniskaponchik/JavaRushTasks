package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        //String string1 = bufread.readLine();
        return bufread.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufread.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bufread.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bufread.readLine());
    }

    public static void main(String[] args) throws Exception {
    }
}
