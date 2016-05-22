package com.rommelrico.coffeeshop;

import com.rommelrico.customers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rommelrico on 5/6/16.
 */
public class CoffeeAttendant {
    private List<Customer> customerList;
    private List<String> completedDrinks;

    public CoffeeAttendant() {
        customerList = new ArrayList<Customer>();
        completedDrinks = new ArrayList<String>();
    }

    public void takeOrder(Customer customer) {
        customerList.add(customer);
        System.out.println("Coffee Attendant: "+customer.getName()
                +", I've started work on your "+customer.getDrinkOrdered());
    }

    public void prepareDrink(String drinkToBePrepared) {
        double timeTaken = Math.random() * 10;
        try {
            Thread.sleep((long) (timeTaken * 1000));
            completedDrinks.add(drinkToBePrepared);
        } catch (InterruptedException e) {
            System.out.println("Drink was not prepared.");
        }
    }

    public void callOutCompletedOrders() {
        for (String drink : completedDrinks) {
            System.out.println("Order up: "+drink);
            for (Customer customer : customerList) {
                customer.orderReady(drink);
            }
        }
    }
}
