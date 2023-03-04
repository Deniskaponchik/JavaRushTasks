package com.javarush.task.task17.task1721;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность */

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String path1 = reader.readLine();
            String path2 = reader.readLine();

            //BufferedReader br = new BufferedReader(new FileReader("D:/Work PC/1/Удалить/Java/str1.txt");
            BufferedReader br1 = new BufferedReader(new FileReader(path1));
            String s1;
            while((s1=br1.readLine())!=null){
                allLines.add(s1);
            }
            //BufferedReader br = new BufferedReader(new FileReader("D:/Work PC/1/Удалить/Java/str2.txt");
            BufferedReader br2 = new BufferedReader(new FileReader(path2));
            String s2;
            while((s2=br2.readLine())!=null){
                forRemoveLines.add(s2);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //br.close();
            reader.close();
            //fr.close();
        }
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {
        int compareCount = 0;
        for (String str : forRemoveLines) {
            if (allLines.contains(str)){
                compareCount++;
            }
        }
        if(compareCount == forRemoveLines.size()){
            allLines.removeAll(forRemoveLines);
            System.out.println("удалены все совпадающие строки");
        }
        else{
            allLines.clear();
            System.out.println("Проброшено исключение");
            throw new CorruptedDataException();
        }


    }
}
