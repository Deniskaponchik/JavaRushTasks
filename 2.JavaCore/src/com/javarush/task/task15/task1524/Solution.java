package com.javarush.task.task15.task1524;

public class Solution {
    // 1
    static {
        init();
    }
    public static void init() {
        System.out.println("static void init()");
    }

    // 2
    static {
        System.out.println("Static block");
    }

    // 3
    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    // 4


    {
        System.out.println("Non-static block");
        printAllFields(this);
    }


    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }




    public int i = 6;
    public String name = "First name";


    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }


}
