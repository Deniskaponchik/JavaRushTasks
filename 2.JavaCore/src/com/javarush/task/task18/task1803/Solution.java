package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //HashMap
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
            /*
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                StringBuilder result = new StringBuilder();
                if(maxFrequancy == entry.getValue()){
                    result.append(entry.getKey() + " ");
                }
                System.out.print(result);
            }*/
        }
        catch (IOException e){
        }



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


        /* через массив long. Самый быстрый код
        long[] arrBytes = new long[256];
        while (fis.available()>0)
            array[fis.read()]++;
        long maxRepeat = 0;
        for (int i = 0; i <array.length  ; i++) {
            if (array[i]>maxRepeat) maxRepeat = array[i];
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==maxRepeat) System.out.print(i + " ");
        }
        */

    }
}
