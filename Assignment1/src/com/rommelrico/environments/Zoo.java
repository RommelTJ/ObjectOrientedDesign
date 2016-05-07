package com.rommelrico.environments;

import com.rommelrico.animals.*;

/**
 * Created by Rommel on 4/6/2016.
 */
public class Zoo {
    public static void main(String[] args) {
        //Animal is now abstract, so it cannot be instantiated.
        //Animal animal1 = new Animal("Rhino", 2, "male", 20.4);
        //Animal animal2 = new Animal("Giraffe", 3, "female", 400.4);
        //Animal animal3 = new Animal("Hippo", 4, "male", 672.8);
//
//        System.out.println(animal1.eat());
//        System.out.println(animal1.sleep());
//        System.out.println(animal2.eat());
//        System.out.println(animal2.sleep());
//        System.out.println(animal3.eat());
//        System.out.println(animal3.sleep());

        Animal chicken = new Chicken("Betty", 5, "female", 2.4);
        Animal fish = new Fish("Clownfish", 6, "male", 0.4);
        Animal sparrow = new Sparrow("Tomata", 5, "female", 2.4);

//        System.out.println(chicken.eat());
//        System.out.println(chicken.sleep());
//        System.out.println(fish.eat());
//        System.out.println(fish.sleep());
//        System.out.println(sparrow.eat());

//        System.out.println(fish.swim());

//        sparrow.fly();
//        sparrow.move();
//        fish.move();

//        moveAnimals(fish);
//        moveAnimals(chicken);
//        moveAnimals(sparrow);

        Flyable flyingBird = new Sparrow("Pretty com.rommelrico.animals.Bird", 1, "male", 0.7);
        flyingBird.fly();
    }

    public static void moveAnimals(Animal animal) {
        animal.move();
    }
}
