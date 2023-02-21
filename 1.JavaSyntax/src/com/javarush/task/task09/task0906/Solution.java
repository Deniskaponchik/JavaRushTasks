package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        //String classLoaderName = Thread.currentThread().getStackTrace()[2].getClassLoaderName();
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        //System.out.println(className);

        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        //System.out.println(methodName);

        System.out.println(className+": "+methodName+": "+text);
    }
}
