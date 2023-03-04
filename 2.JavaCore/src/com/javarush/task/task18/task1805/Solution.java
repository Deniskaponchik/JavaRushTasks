package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/* Сортировка байт*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*HashMap
        HashMap<Integer, Integer> map = new HashMap<>(); //HashMap<byte, frequancy>
        try{
            String fileName = reader.readLine();
            //FileInputStream inputStream = new FileInputStream("D:/Work PC/1/Удалить/Java/str1.txt");
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() > 0) {     //пока остались непрочитанные байты
                int getByte = fis.read();     //прочитать очередной байт
                map.put(getByte, map.getOrDefault(getByte, 0) + 1);
            }
            fis.close();

            //int minFrequancy = Collections.min(map.values());
            int maxFrequancy = Collections.max(map.values());

            //byteMap.forEach((k,v) -> {if (v == maxValues) System.out.print(k + " ");});
            map.forEach((k,v) -> {if (v == maxFrequancy) System.out.print(k + " ");});
            //for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //StringBuilder result = new StringBuilder();
                //if(maxFrequancy == entry.getValue()){
                  //  result.append(entry.getKey() + " ");
                //}
              //  System.out.print(result);
            //}
        }        catch (IOException e){        }
        */


        /*
        int[] byteArray = new int[256];
        try{
            String fileName = reader.readLine();
            //FileInputStream inputStream = new FileInputStream("D:/Work PC/1/Удалить/Java/str1.txt");
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() > 0)  {   //пока остались непрочитанные байты
                byteArray[fis.read()]++;
            }
            fis.close();

            int minOfArray = Arrays.stream(byteArray).min().getAsInt();
            for (int i = 1; i <= 256; i++) {
                if(byteArray[i] == minOfArray){
                    System.out.println(byteArray[i]);
                }
            }
        }
        catch (IOException e){
        } */


        //4. https://javarush.com/groups/posts/1468-pobaytovaja-rabota-s-faylami
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] arrBytes = new long[256];       //индекс у arrBytes определен в пределах 0..255
        byte fileImage[]=new byte[inputStream.available()];   //массив байт, элементы которого имеют значение -128..127
        long fileSize=fileImage.length;

        inputStream.read(fileImage);
        for(int i = 0; i < fileSize; i++)
            arrBytes[fileImage[i] & 0b11111111] = 1;
        for (int i = 0; i < arrBytes.length; i++)
            if(arrBytes[i] == 1) System.out.print(i + " ");
        inputStream.close();



        /* 5. Используем буфер
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] arrBytes = new long[256];

        int  bufferSize = 64000;
        byte buffer[]   = new byte[64000];

        while (inputStream.available() > 0) {
            if (inputStream.available() < 64000) bufferSize = inputStream.available();
            inputStream.read(buffer, 0, bufferSize);
            for (long i = 255; i >= 0; i--)
                if (arrBytes[(int) i] > 0) System.out.print(i + " ");
        }
        inputStream.close();
        */
    }
}
