package ua.ithillel.lms.homework2.model;

public class Animal {
    private static int counter;

    Animal() {
        countAnimals();
    }

    void countAnimals(){
        counter++;
    }

    void run(String name,int distance){
        System.out.println(name + " ran " + distance + " meters");
    }

    void swim(String name,int distance){
        System.out.println(name + " swam " + distance  + " meters");
    }

    int getCounter() {
        return counter;
    }
}
