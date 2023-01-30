package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    //String getDescription(String getDescription, String Country, int getCountOfEggsPerMonth) {
    String getDescription( ) {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), RUSSIA, getCountOfEggsPerMonth());
    }
}
