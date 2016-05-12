package com.rommelrico.remotes;

import com.rommelrico.devices.Device;

/**
 * Created by Rommel on 5/1/2016.
 */
public class RemoteControl {
    private Device myDevice;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device myDevice){
        this.myDevice = myDevice;
        System.out.println("---- connected to: " + myDevice + "----");
    }

    public void turnOff() {
        myDevice.turnOff();
    }

    public void turnOn() {
        myDevice.turnOn();
    }
}