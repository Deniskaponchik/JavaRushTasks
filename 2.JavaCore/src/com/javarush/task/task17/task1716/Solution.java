package com.javarush.task.task17.task1716;

/* Синхронизированные методы */

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();


    // не редактирует переменных класса
    private void method0() {
        Double d = method3();
    }


    // не редактирует переменных класса
    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }


    //не редактирует переменных класса
    public void method2(int param1) {
        param1++;
    }


    // Редактирует переменную класса
    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }


    //ЕСТЬ переменная класса
    private synchronized void method4() {

        sb.append(1).append(1).append(1).append(1);
    }


    //не редактирует переменных класса
    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }


    //ЕСТЬ переменная класса
    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    //не редактирует переменных класса
    String method7(double param2) {

        return "" + param2;
    }


    public static void main(String[] args) {    }
}
