package ua.ithillel.lms.homework2;

import ua.ithillel.lms.homework2.model.Cat;
import ua.ithillel.lms.homework2.model.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Tuzik");

        Cat cat = new Cat("Leopold");
        Cat cat1 = new Cat("Boris");
        Cat cat2 = new Cat("Arnold");


        //test
        System.out.println("-------------------------------------------------");
        dog.run(-1);
        dog1.run(150);
        dog2.run(501);

        System.out.println("-------------------------------------------------");
        dog.swim(-1);
        dog1.swim(5);
        dog2.swim(11);

        System.out.println("-------------------------------------------------");
        cat.run(-2);
        cat1.run(100);
        cat2.run(220);

        System.out.println("-------------------------------------------------");
        cat.swim(12);

        System.out.println("-------------------------------------------------");
        System.out.println("Total amount of animals is " + dog.getTotalCounter());
        System.out.println("Amount of dogs " + dog.getDogCounter());
        System.out.println("Amount of cats " +   cat.getCatCounter());

    }
}
