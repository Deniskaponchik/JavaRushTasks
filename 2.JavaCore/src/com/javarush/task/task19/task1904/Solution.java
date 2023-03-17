package com.javarush.task.task19.task1904;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String str = fileScanner.nextLine();
            String[] personData = str.split(" ");

            //LocalDate personDate = LocalDate.parse("2018-05-05");
            //LocalDate personDate = LocalDate.parse(personData[5]+"-"+personData[4]+"-"+personData[3]);

            //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
            //String dateInString = "7-Jun-2013";
            String dateInString = personData[3]+personData[4]+personData[5];
            Date personDate = formatter.parse(dateInString);

            return new Person(personData[1], personData[2], personData[0], personDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
