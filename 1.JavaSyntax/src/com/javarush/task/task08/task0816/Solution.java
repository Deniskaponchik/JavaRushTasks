package com.javarush.task.task08.task0816;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.GregorianCalendar;
public class Solution {

    public static Map<String, Date> createMap() throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();

        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Патов", dateFormat.parse("AUGUST 19 1980"));
        map.put("Лясин", dateFormat.parse("APRIL 06 1979"));
        map.put("Бибикова", dateFormat.parse("OCTOBER 26 2008"));
        map.put("Хворов", dateFormat.parse("DECEMBER 22 1961"));
        map.put("Науськина", dateFormat.parse("FEBRUARY 13 1959"));
        map.put("Смирнов", dateFormat.parse("JULY 18 2000"));
        map.put("Ярцев", dateFormat.parse("MAY 1 2012"));
        map.put("Николаев", dateFormat.parse("JUNE 1 1912"));
        map.put("Филимонов", dateFormat.parse("MAY 19 2002"));
        map.put("Тупов", dateFormat.parse("SEPTEMBER 15 1967"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8);
    }

    //public class RandomDateOfBirth {
        public static void RandomDateOfBirth() {
            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(1900, 2010);
            gc.set(gc.YEAR, year);
            int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
        }
        public static int randBetween(int start, int end) {
            return start + (int)Math.round(Math.random() * (end - start));
        }
    //}

    public static void main(String[] args) {

    }
}
