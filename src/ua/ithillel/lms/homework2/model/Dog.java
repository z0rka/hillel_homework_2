package ua.ithillel.lms.homework2.model;

public class Dog extends Animal{
    private static int counter;
    private String dogName;

    public Dog(String dogName) {
        super();

        this.dogName = dogName;

        countDogs();
    }

    private void countDogs(){
        counter++;
    }

    public void run(int distance){
        if(distance <= 500 && distance > 0){
            super.run(dogName,distance);
        }
        else{
            System.out.println("A dog can't run that distance");
        }
    }

    public void swim(int distance){
        if(distance <= 10 && distance > 0){
            super.swim(dogName,distance);
        }
        else{
            System.out.println("A dog can't swim that distance");
        }
    }

    public int getDogCounter() {
        return counter;
    }

    public int getTotalCounter(){
        return getCounter();
    }
}
