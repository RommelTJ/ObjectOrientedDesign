package com.rommelrico.animals;

/**
 * Created by Rommel on 4/6/2016.
 */
public class Fish extends Animal {

    public Fish(String name, int age, String gender, double weightInLbs) {
        super(name, age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Moving like a com.rommelrico.animals.Fish");
    }

    public String swim() {
        return this.name + " is swimming!";
    }
}
