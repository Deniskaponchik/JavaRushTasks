package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Номер месяца*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));

        /*
        String[] months = {"Empty","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String month = bufread.readLine();
        Arrays.asList(months).indexOf(month);
        System.out.println(month + " is the " + Arrays.asList(months).indexOf(month) + " month");
         */

        ArrayList<String> months  = new ArrayList<String>(Arrays.asList("Empty","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        String month = bufread.readLine();
        System.out.println(month + " is the " + months.indexOf(month) + " month");

    }
}
