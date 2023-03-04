package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String fileName = reader.readLine();
            //FileInputStream inputStream = new FileInputStream("D:/Work PC/1/Удалить/Java/str1.txt");
            FileInputStream inputStream = new FileInputStream(fileName);

            //int maxByte = Integer.MIN_VALUE;
            int maxByte = inputStream.read();  //Первый байт берем за минимальное значение.
            //System.out.println(maxByte);

            while (inputStream.available() > 0)    //пока остались непрочитанные байты
            {
                int data = inputStream.read();     //прочитать очередной байт
                //sum += data; //добавить его к общей сумме
                if(data > maxByte) maxByte = data;
            }
            inputStream.close();
            System.out.println(maxByte);
        }
        catch (IOException e){

        }
    }
}
