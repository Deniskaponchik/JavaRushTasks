package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        /*
        //try(FileInputStream input = new FileInputStream(Statics.FILE_NAME); FileOutputStream output = new FileOutputStream(List<String> lines)){
        try(BufferedReader bufread = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));) {
            while (bufread.ready()) {
                lines.add(bufread.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }  */


        //Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);
        /*try {
            Files.lines(Paths.get(Statics.FILE_NAME), StandardCharsets.UTF_8).forEach(s -> lines.add(s));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */

        try (Stream<String> stream = Files.lines(Paths.get(Statics.FILE_NAME))) {
            stream.forEach(s -> lines.add(s));  } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {

        System.out.println(lines);
    }
}
