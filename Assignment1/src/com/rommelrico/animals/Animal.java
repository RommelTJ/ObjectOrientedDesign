package com.rommelrico.animals;

/**
 * Created by Rommel on 4/6/2016.
 */
public abstract class Animal {
    //Properties
    String name;
    int age;
    String gender;
    double weightInLbs;

    public Animal() {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.weightInLbs = 0.0;
    }

    public Animal(String name, int age, String gender, double weightInLbs) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public String eat() {
        return this.name + " is eating!";
    }

    public String sleep() {
        return this.name + " is sleeping";
    }

    public abstract void move();
}
