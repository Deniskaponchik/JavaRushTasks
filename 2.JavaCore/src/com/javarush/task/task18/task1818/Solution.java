package com.javarush.task.task18.task1818;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String fileName1 = reader.readLine();
    String fileName2 = reader.readLine();
    String fileName3 = reader.readLine();

    try (
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
            BufferedReader fileReader3 = new BufferedReader(new FileReader(fileName3));
            FileWriter fileWriter1 = new FileWriter(fileName1, true);

    ){
        while (fileReader2.ready()) {
            //Product product = getProduct(fileReader.readLine());
            //products.add(product);
            fileWriter1.write(fileReader2.read());
        }
        while (fileReader3.ready()) {
            //Product product = getProduct(fileReader.readLine());
            //products.add(product);
            fileWriter1.write(fileReader3.read());
        }
    }





    }
}
