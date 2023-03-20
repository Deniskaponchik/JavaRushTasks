//http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
package com.javarush.task.task20.task2015;
import java.io.*;

public class Solution implements Serializable, Runnable {
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        //runner = new Thread(this);
        //runner.start();
        startAnimation();
    }

    private void startAnimation() {
        runner = new Thread(this);
        runner.start();
        }

    public void run() {
        // do something here, doesn't matter what
        while(true){
            // выполнение анимации
        }

    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // наш "псевдо-конструктор"
        in.defaultReadObject();
        // теперь мы вновь получили "живой" объект, поэтому давайте перестроим и запустим его
        runner = new Thread(this);
        runner.start();
    }




    public static void main(String[] args) {
        //Solution sltn = new Solution(45);
        //sltn.
    }
}




