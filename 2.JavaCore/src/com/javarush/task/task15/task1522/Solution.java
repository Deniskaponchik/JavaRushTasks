package com.javarush.task.task15.task1522;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution implements Planet {
    public static void main(String[] args) {    }
    public static Planet thePlanet;
    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufread.readLine();
        if(string1.equals("sun")) { thePlanet = Sun.getInstance();        }
        else if(string1.equals("moon")) { thePlanet = Moon.getInstance();        }
        else if(string1.equals("earth")){
            thePlanet = Earth.getInstance();
            //Planet thePalnet = new Earth();
        }
        else { thePlanet = null;        }

    }
}
