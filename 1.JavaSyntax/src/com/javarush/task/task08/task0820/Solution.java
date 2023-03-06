package com.javarush.task.task08.task0820;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }
    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }
    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        /*
        Iterator<Object> it = pets.iterator();
        while (it.hasNext())
        {
            if(it.next() instanceof Cat) {
        }*/
    }
    public static void printPets(Set<Object> pets) {
        //pets.forEach(pet -> System.out::println(pet));
        for (Object pet : pets) {            System.out.println(pet);        }
    }
    public static class Cat {}
    public static class Dog{}
}
