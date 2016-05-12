package com.rommelrico.devices;

/**
 * Created by Rommel on 5/1/2016.
 */
public class SurroundSoundSystem implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sound system has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound system has been turned off");
    }

    @Override
    public String toString() {
        return "SurroundSoundSystem";
    }

}
