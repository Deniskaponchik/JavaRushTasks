package com.javarush.task.task18.task1817;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int probel = 32;
        int probelCount = 0;
        int allElements = 0;
        String line;
        //System.out.println(args[0]);

        //Подсчитал правильно
        try (BufferedReader bufread = new BufferedReader(new FileReader(args[0]));) {
            while (bufread.ready()) {
                //strings += bufread.readLine() + " ";
                allElements++;
                if(probel == bufread.read()) probelCount++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Не понятно что подсчитал
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[0]));
             //BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/Work PC/1/Удалить/Java/str2.txt"));
        ) {
                while (bis.read() != -1) {
                    allElements++;
                    if(probel == bis.read()) probelCount++;
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*Подсчитал правильно
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                //char readChar = (char) fileReader.read();
                //if (ENGLISH_CHARACTERS.contains(readChar)) countOfEnglishChars++;
                allElements++;
                if(probel == fileReader.read()) probelCount++;
            }
        }*/


        //System.out.println(allElements);
        //System.out.println(probelCount);
        System.out.format("%.2f", 1.0*probelCount/allElements*100);







    }
}
