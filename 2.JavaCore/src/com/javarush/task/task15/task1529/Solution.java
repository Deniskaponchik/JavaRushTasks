package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        String flyer = bufread.readLine();
        if (flyer.equals("helicopter")) {
            result = new Helicopter();
            //System.out.println(flyer);
        }   else {
            int number1 = Integer.parseInt(bufread.readLine());
            result = new Plane(number1);
        }
    }


}
