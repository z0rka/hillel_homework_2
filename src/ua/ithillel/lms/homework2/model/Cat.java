package ua.ithillel.lms.homework2.model;

public class Cat extends Animal{
    private static int counter;
    private String catName;

    public Cat(String catName) {
        super();

        this.catName = catName;

        countCats();
    }

    private void countCats(){
        counter++;
    }

    public void run(int distance){
        if(distance <= 200 && distance > 0){
            super.run(catName,distance);
        }
        else{
            System.out.println("A cat can't run that distance");
        }
    }

    public void swim(int distance){
        System.out.println(catName + " can`t swim");
    }

    public int getCatCounter() {
        return counter;
    }

    public int getTotalCounter(){
        return getCounter();
    }
}
