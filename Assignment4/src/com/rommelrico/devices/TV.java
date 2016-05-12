package com.rommelrico.devices;

/**
 * Created by Rommel on 5/1/2016.
 */
public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV has been turned off");
    }

    @Override
    public String toString() {
        return "TV";
    }

}
