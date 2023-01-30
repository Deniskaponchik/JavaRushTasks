package com.javarush.task.task14.task1408;

public class Solution implements Country {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {
        static Hen getHen(String country) {

            Hen hen = null;
                 if (country.equals(Country.RUSSIA)) return new RussianHen();
            else if (country.equals(Country.BELARUS)) return new BelarusianHen();
            else if (country.equals(Country.MOLDOVA)) return new MoldovanHen();
            else return new UkrainianHen();

            /*
            Hen hen = switch (country) {
                case Country.BELARUS -> new BelarusianHen();
                case Country.RUSSIA -> new RussianHen();
                case Country.UKRAINE -> new UkrainianHen();
                case Country.MOLDOVA -> new MoldovanHen();
                default -> null;
            };
            return hen;
            */
        }
    }

}
