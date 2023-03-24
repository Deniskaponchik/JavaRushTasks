package com.javarush.task.task21.task2113;
import java.util.ArrayList;
import java.util.List;
public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Lucky", 3, 0));
        game.getHorses().add(new Horse("Slevin", 3, 0));
        game.getHorses().add(new Horse("Homer", 3, 0));

        game.run();
        game.printWinner();
        /*
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Vaska", 3.0, 0));
        horses.add(new Horse("Petka", 3.0, 0));
        horses.add(new Horse("Maska", 3.0, 0));
        
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
         */
    }

    private List<Horse> horses;
    static Hippodrome game;



    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse hrs : horses){
            hrs.move();
        }
    }

    public void print(){
        for (Horse hrs : horses){
            hrs.print();
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
    public List<Horse> getHorses() {
        return horses;
    }





    public Horse getWinner(){
        double maxDist = 0.0;
        for (Horse hrs : horses){
            if (hrs.getDistance() > maxDist){
                maxDist = hrs.getDistance();
            }
        }
        for (Horse hrs : horses){
            if (hrs.getDistance() == maxDist){
                return hrs;
            }
        }
        return null;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName() + "!");
    }

}
