package com.rommelrico.client;

import com.rommelrico.coffeeshop.CoffeeAttendant;
import com.rommelrico.customers.Customer;

public class CoffeeShop {

    public static void main(String[] args) {
        Customer liza = new Customer("Liza", "Chai");
        Customer rommel = new Customer("Rommel", "Espresso");

        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        coffeeAttendant.takeOrder(liza);
        coffeeAttendant.takeOrder(rommel);

        //Prepare the drinks
        coffeeAttendant.prepareDrink("Chai");
        coffeeAttendant.prepareDrink("Espresso");

        //Order up!
        coffeeAttendant.callOutCompletedOrders();
    }
}
