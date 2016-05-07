package com.rommelrico.environments;

import com.rommelrico.animals.Human;

/**
 * Created by Rommel on 4/5/2016.
 */
public class Earth {
    public static void main(String[] args) {
        Human rommel = new Human("Rommel", 28, 72, "brown");
        rommel.speak();

        Human joe = new Human("Joe", 12, 100, "white");
        joe.speak();
        joe.walk();
    }
}
