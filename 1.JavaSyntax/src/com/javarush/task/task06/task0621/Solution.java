package com.javarush.task.task06.task0621;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String motherName = reader.readLine();
        //Cat catMother = new Cat(motherName);
        //String daughterName = reader.readLine();
        //Cat catDaughter = new Cat(daughterName, catMother);
        //System.out.println(catMother);
        //System.out.println(catDaughter);

        String grandFatherName = reader.readLine();
        //Cat grandFather = new Cat(grandFatherName, null, null);
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        //Cat grandMother = new Cat(grandMotherName, null, null);
        Cat grandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grandMother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }
    public static class Cat {
        private String name;
        //private Cat parent;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {this.name = name;}
        //Cat(String name, Cat parent) {
        Cat(String name, Cat mother, Cat father) {
        //Cat(String name, String mother, String father) {
            this.name = name;
            //this.parent = parent;
            this.parentMother = mother;
            this.parentFather = father;
        }

        @Override
        public String toString() {
            String res = "The cat's name is " + name;
            if (parentMother == null) {
                res += ", no mother";
            } else {
                res += ", mother is " + parentMother.name;
            }
            if (parentFather == null) {
                res += ", no father";
            } else {
                res += ", father is " + parentFather.name;
            }
            return res;
            //if (parent == null)
            //return "The cat's name is " + name + ", no mother ";
            //else
            //    return "The cat's name is " + name + ", mother is " + parent.name;
            /*
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother" + ", no father ";

            else if (father == null) {
                return "The cat's name is " + name + ", mother is " + mother + ", no father ";
            }
            else if (mother == null) {
                return "The cat's name is " + name + ", no mother" + ", father is " + father;
            }
            else {
                return "The cat's name is " + name + ", no mother" + ", no father ";
            }  */
        }
    }
}
