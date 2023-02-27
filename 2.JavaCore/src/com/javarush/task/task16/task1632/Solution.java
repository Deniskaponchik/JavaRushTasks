package com.javarush.task.task16.task1632;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    /*static {
        threads.add(new Thread("infinity"));
        threads.add(new Thread("interruptedException"));
        threads.add(new Thread("ura"));
        threads.add(new Thread("message"));
        threads.add(new Thread("sytemIn"));
    }*/
    static {
        threads.add(new Infinity());
        threads.add(new InterruptedE());
        threads.add(new Ura());
        threads.add(new MessageM());
        threads.add(new Reader());
    }
    public static void main(String[] args) {           }
    public static class Infinity extends Thread {
        public void run(){
            while(true){}
        }
    }
    public static class InterruptedE extends Thread {
        public void run(){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");;
            }
        }
    }
    public static class Ura extends Thread {
        public void run(){
            try {
                while(true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class MessageM extends Thread implements Message{
        public void run(){
            while(!isInterrupted()){}
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class Reader extends Thread {
        public void run(){
            String line;
            int numbers = 0;
            try (BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));) {
                //while ((line = bufread.readLine()) != null) {
                  while (!(line = bufread.readLine()).equals("N")) {
                    //String string1 = bufread.readLine();
                    numbers += Integer.parseInt(line);
                  }
                System.out.println(numbers);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}