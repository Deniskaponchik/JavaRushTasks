package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }


    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }


    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Obj1 o) {}
    public static void printMatrix(Obj2 o) {}
    public static void printMatrix(Obj3 o) {}
    public static void printMatrix(Obj4 o) {}
    public static void printMatrix(Obj5 o) {}
    public static void printMatrix(Obj6 o) {}
    public static void printMatrix(Obj7 o) {}
    public static void printMatrix(Obj8 o) {}

    public static class Obj1 {}
    public static class Obj2 {}
    public static class Obj3 {}
    public static class Obj4 {}
    public static class Obj5 {}
    public static class Obj6 {}
    public static class Obj7 {}
    public static class Obj8 {}

}
