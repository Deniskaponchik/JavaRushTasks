package com.javarush.task.task20.task2022;
import java.io.*;

public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) throws Exception {

        //Solution solution = new Solution("your_file_name_1.txt");
        Solution solution = new Solution("D:\\WorkPC\\1\\Удалить\\Java\\str1.txt");
        solution.writeObject("some text");
        solution.close();



        String filePath = "D:\\WorkPC\\1\\Удалить\\Java\\str1.bin";
        try (
                //FileOutputStream fileOutput = new FileOutputStream("your_file_name_2.txt");
                FileOutputStream fileOutput = new FileOutputStream(filePath);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

                //FileInputStream fiStream = new FileInputStream("your_file_name_2.txt");
                FileInputStream fiStream = new FileInputStream(filePath);
                ObjectInputStream objectStream = new ObjectInputStream(fiStream)
        ) {

            outputStream.writeObject(solution);
            outputStream.flush();
            outputStream.close();

            //load object from file
            Solution loadedObject = (Solution) objectStream.readObject();

            loadedObject.writeObject("some text - 2");

        } catch (Exception skipped) {
        }
    }

    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    //Пишет строку в файл
    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
