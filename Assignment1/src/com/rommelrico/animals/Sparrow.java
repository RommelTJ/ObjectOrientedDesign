package com.rommelrico.animals;

/**
 * Created by Rommel on 4/10/2016.
 */
public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age, String gender, double weightInLbs) {
        super(name, age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Flying!");
    }
}
