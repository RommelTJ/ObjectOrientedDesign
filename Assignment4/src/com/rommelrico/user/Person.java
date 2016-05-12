package com.rommelrico.user;

import com.rommelrico.devices.Projector;
import com.rommelrico.devices.SurroundSoundSystem;
import com.rommelrico.devices.TV;
import com.rommelrico.remotes.RemoteControl;

/**
 * Created by Rommel on 5/1/2016.
 */
public class Person {
    public static void main(String[] args) {
        //Devices
        TV myTV = new TV();
        Projector myProjector = new Projector();
        SurroundSoundSystem mySurroundSoundSystem = new SurroundSoundSystem();

        //Remote
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(myTV);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl.connectToDevice(myProjector);
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl.connectToDevice(mySurroundSoundSystem);
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
