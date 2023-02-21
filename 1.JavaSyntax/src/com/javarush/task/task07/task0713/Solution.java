package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> integers0 = new ArrayList<>();
        ArrayList<Integer> integers3 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();


        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            integers0.add(Integer.parseInt(bufread.readLine()));
        }

        for (int x : integers0){
            if (x%3==0 || (x%3==0 && x%2==0)) integers3.add(x);
            if (x%2==0 || (x%2==0 && x%3==0)) integers2.add(x);
            if (!(x%3==0) && !(x%2==0)) integers1.add(x);
        }

        printList(integers3);
        printList(integers2);
        printList(integers1);



    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        //for (int y : list){System.out.println(y);}
        list.forEach(System.out::println);
    }
}


