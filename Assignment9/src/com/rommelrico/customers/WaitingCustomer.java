package com.rommelrico.customers;

/**
 * Created by rommelrico on 5/6/16.
 */
public interface WaitingCustomer {
    void orderReady(String completedDrink);
    public String getName();
    public String getDrinkOrdered();
}
