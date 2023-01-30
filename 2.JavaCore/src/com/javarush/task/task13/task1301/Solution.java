package com.javarush.task.task13.task1301;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        public void askForMore(String message) {};

        public void sayThankYou() {};

        public void sleepOnTheFloor(){};

        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        };


    }
}
