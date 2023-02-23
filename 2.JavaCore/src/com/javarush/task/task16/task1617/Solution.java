package com.javarush.task.task16.task1617;
public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            /*
            StringBuffer sb = new StringBuffer();
            try {
                while(!Thread.currentThread().isInterrupted() || numSeconds == 0){
                    sb.append(numSeconds);
                    sb.append(" ");
                    numSeconds--;
                    if (numSeconds == 0) {
                        sb.append("Марш!");
                    }
                    Thread.sleep(1000);
                }
            } catch(InterruptedException e){
                //e.printStackTrace();
                sb.append("Прервано!");
            }
            System.out.println(sb);  */

            try {
                while(numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    numSeconds--;
                }
                System.out.print("Марш!");
            } catch(InterruptedException e){
                //e.printStackTrace();
                System.out.print("Прервано!");
            }






        }
    }
}
