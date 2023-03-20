package com.javarush.task.task20.task2014;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mySavedObject"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mySavedObject"));


        Solution savedObject = new Solution(45);
        oos.writeObject(savedObject);

        Solution loadedObject = (Solution) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(savedObject);
        System.out.println(loadedObject);
        System.out.println(savedObject.toString().equals(loadedObject.toString()));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {

        return this.string;
    }
}
