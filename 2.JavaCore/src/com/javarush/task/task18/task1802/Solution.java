package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String fileName = reader.readLine();
            //FileInputStream inputStream = new FileInputStream("D:/Work PC/1/Удалить/Java/str1.txt");
            FileInputStream inputStream = new FileInputStream(fileName);

            //int byyte = Integer.MAX_VALUE;
            int minByte = inputStream.read();  //Первый байт берем за минимальное значение.
            System.out.println(minByte);

            while (inputStream.available() > 0)    //пока остались непрочитанные байты
            {
                int data = inputStream.read();     //прочитать очередной байт
                //sum += data; //добавить его к общей сумме
                if(data < minByte) minByte = data;
            }
            inputStream.close();
            System.out.println(minByte);
            }
        catch (IOException e){

        }
    }
}
