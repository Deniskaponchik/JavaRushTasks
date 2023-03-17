package com.javarush.task.task08.task0827;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Работа с датой*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    /*
    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }*/


    /*
    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar parseDate = new GregorianCalendar();
        parseDate.setTime(formatter.parse(date));
        int days = parseDate.get(Calendar.DAY_OF_YEAR);
        return days % 2 != 0;
    }*/

    // LocalDate
    public static boolean isDateOdd(String date) {
        Locale locale = new Locale("en", "EN");
        Locale.setDefault(locale);
        DateTimeFormatter frmt = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMM d yyyy").toFormatter();
        LocalDate prsd = LocalDate.parse(date, frmt);
        return prsd.getDayOfYear() % 2 != 0;
    }





}
