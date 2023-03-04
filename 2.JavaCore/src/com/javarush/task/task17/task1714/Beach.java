package com.javarush.task.task17.task1714;
//https://javarush.com/tasks/com.javarush.task.task17.task1714#discussion
//https://javarush.com/groups/posts/2262-comparator-v-java

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach b) {

        // https://habr.com/en/post/247015/
        //int result;
        //result = Double.compare(d, o.d);
        //if(result != 0) return result;
        //result = Float.compare(b.distance, distance);
        //if(result != 0) return result;
        //result = Integer.compare(quality, b.quality);
        //if(result != 0) return result;
        //result = s.compareTo(o.s);
        //if(result != 0) return result;
        //result = Character.compare(c, o.c);
        //return result;

        return Float.compare(b.distance, distance) + Integer.compare(quality, b.quality);
    }

    public static void main(String[] args) {    }


}

