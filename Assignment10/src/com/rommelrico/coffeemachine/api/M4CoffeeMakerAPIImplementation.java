package com.rommelrico.coffeemachine.api;

/**
 * Created by rommelrico on 5/6/16.
 */
public class M4CoffeeMakerAPIImplementation implements CoffeeMakerAPI {
    @Override
    public int getWarmerPlateStatus() {
        return 0;
    }

    @Override
    public int getBoilerStatus() {
        return 0;
    }

    @Override
    public int getBrewButtonStatus() {
        return 0;
    }

    @Override
    public void setBoilerState(int boilerStatus) {

    }

    @Override
    public void setWarmerState(int warmerState) {

    }

    @Override
    public void setIndicatorState(int indicatorState) {

    }

    @Override
    public void setReliefValveState(int reliefValveState) {

    }
}
