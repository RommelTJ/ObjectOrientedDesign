package com.rommelrico.animals;

/**
 * Created by Rommel on 4/6/2016.
 */
public class Bird extends Animal {

    public Bird(String name, int age, String gender, double weightInLbs) {
        super(name, age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Moving like a bird.");
    }

//    public String fly() {
//        return this.name + " is flying!";
//    }
}
