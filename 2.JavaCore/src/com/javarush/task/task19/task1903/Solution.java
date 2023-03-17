package com.javarush.task.task19.task1903;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeData() {
            @Override
            public String getCountryCode() {                return "UA";            }
            @Override
            public String getCompany() {                return "JavaRush Ltd.";            }
            @Override
            public String getContactFirstName() {                return "Ivan";            }
            @Override
            public String getContactLastName() {                return "Ivanov";            }
            @Override
            public int getCountryPhoneCode() {                return 38;            }
            @Override
            public int getPhoneNumber() {                return 71112233;            }
        });

        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getPhoneNumber());

    }

    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }



    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        IncomeDataAdapter(IncomeData data){
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String temp = data.getPhoneNumber() + "";
            while (temp.length() < 10) {
                temp = "0" + temp;
            }
            String result = temp.replaceFirst("(\\d+)(\\d{3})(\\d{2})(\\d{2})", "($1)$2-$3-$4");
            result = "+" + data.getCountryPhoneCode() + result;
            return result;
        }
    }



    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }



}