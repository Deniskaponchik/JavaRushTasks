package com.javarush.task.task18.task1813;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AmigoOutputStream extends FileOutputStream {
    FileOutputStream amigoOutputStream;
    //public static String fileName = "C:/tmp/result.txt";
    public static String fileName = "D:/Work PC/1/Удалить/Java/str1.txt";

    public AmigoOutputStream(FileOutputStream amigoOutputStream) throws FileNotFoundException {
        super(fileName);
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void close() throws IOException {
        amigoOutputStream.flush();
        amigoOutputStream.write("JavaRush © All rights reserved.".getBytes());
        amigoOutputStream.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
