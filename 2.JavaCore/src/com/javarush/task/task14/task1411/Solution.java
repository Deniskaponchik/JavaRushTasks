package com.javarush.task.task14.task1411;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        //String person = "";
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while ((key = reader.readLine()).matches("user|loser|coder|proger"))
        {
            //создаем объект, пункт 2
                 if (key.equals("user")) person = new User();
            else if (key.equals("loser")) person = new Loser();
            else if (key.equals("coder")) person = new Coder();
            else if (key.equals("proger")) person = new Proger();

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof User) ((User)person).live();
        if (person instanceof Loser) ((Loser)person).doNothing();
        if (person instanceof Coder) ((Coder)person).writeCode();
        if (person instanceof Proger) ((Proger)person).enjoy();
    }
}
