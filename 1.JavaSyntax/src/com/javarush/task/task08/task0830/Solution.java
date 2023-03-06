package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //Пузырьковая сортировка
        for (int i = array.length-1; i > 0; i--) { // i = конечный элемент массива
            for (int j = 0; j < i; j++) {          // пока j не дойдёт от нуля до конца
                if (isGreaterThan(array[j], array[j+1])) { //если нудевой элемент больше чем первый
                    String tmp = array[j];                 //меняем их местами
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
/*
        1. Внешний цикл fori, который пробегается по всей длине массива.
        2. Внутренний цикл forj, который пробегается по всей длине массива-1, чтобы не вылететь за его приделы при сравнении элементов.
        3. Внутри последнего цикла проверка, в которой мы и вызываем на помощь метод isGreaterThan, передавая ему аргументы из индекса[ j ] и [ j + 1 ] на выяснение кто из них больше, если он возвращает истину, то...
        4. Меняем элементы местами: создаём строку swap и копируем в неё содержимое текущего индекса[ j ], затем в текущий индекс копируем содержимое следующего индекса[ j + 1 ], и наконец в следующий индекс копируем содержимое временной переменной swap.
*/
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
