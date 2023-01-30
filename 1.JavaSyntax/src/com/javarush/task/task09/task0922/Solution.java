package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Создаем новую переменную класса дата и называем ее date.
        //Присваиваем ей значение формата, указанного в скобках, и полученного из разбора консольной строки.
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(reader.readLine());

        //Создаем новый тип формата согласно желаниям валидатора:
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);


        System.out.println(dateFormat.format(date).toUpperCase());


    }
}
