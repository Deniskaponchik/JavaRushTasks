package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Oksana Stihovna Pirozhkova";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Tat`yana Nikolaevna Zhban";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Galina Blanca PitBul`";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Marina Evgen`evna Shtukaturka";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Sereda Demidova";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Ramzan";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Davlet";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Nikolai Ivanovich Yaichko";

        Terran terran1 = new Terran();
        terran1.name = "Oleg";
        Terran terran2 = new Terran();
        terran2.name = "Igor";
        Terran terran3 = new Terran();
        terran3.name = "Ivan";
        Terran terran4 = new Terran();
        terran4.name = "Tolik Yebolic";





    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
