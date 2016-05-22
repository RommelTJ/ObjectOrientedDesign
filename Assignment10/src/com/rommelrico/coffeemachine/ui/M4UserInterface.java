package com.rommelrico.coffeemachine.ui;

import com.rommelrico.coffeemachine.api.CoffeeMakerAPI;
import com.rommelrico.coffeemachine.api.Pollable;

/**
 * Created by rommelrico on 5/6/16.
 */
public class M4UserInterface extends UserInterface implements Pollable {
    private CoffeeMakerAPI api;

    public M4UserInterface(CoffeeMakerAPI api) {
        this.api = api;
    }

    @Override
    public void done() {
        api.setIndicatorState(api.INDICATOR_ON);
    }

    @Override
    public void completeCycle() {
        api.setIndicatorState(api.INDICATOR_OFF);
    }

    @Override
    public void poll() {
        int buttonStatus = api.getBrewButtonStatus();
        if (buttonStatus == api.BREW_BUTTON_PUSHED) {
            startBrewing();
        }
    }
}
