package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        int x = x2 - x1;
        double xq2 = Math.pow(x, 2);

        int y = y2 - y1;
        double yq2 = Math.pow(y, 2);

        double xy = xq2 + yq2;

        return Math.sqrt(xy);

    }

    public static void main(String[] args) {

    }
}
