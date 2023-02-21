package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double a = Double.parseDouble(reader.readLine());  //считывание числа
        Double remainder = a % 5;

        //if ( a % 5 == 0 || a % 5 > 0 && a % 5 < 3) {
        if (remainder == 0 || (remainder > 0 && remainder < 3.0)){
            System.out.println("зелёный");
        }
        //if ( a % 5 == 0 || a % 5 > 0 && a % 5 < 3) {
        if (remainder >= 3.0 && remainder < 4.0){
            System.out.println("жёлтый");
        }
        if ( remainder >= 4.0) {
            System.out.println("красный");
        }
    }
}