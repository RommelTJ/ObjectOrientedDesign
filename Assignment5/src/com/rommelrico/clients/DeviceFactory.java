package com.rommelrico.clients;

import com.rommelrico.processes.*;

/**
 * Created by Rommel on 5/1/2016.
 */
public class DeviceFactory {
    static GeneralManufacturingProcess manufacturer;

    public static void main(String[] args) {
        manufacturer = new LaptopManufacturingProcess("Laptop manufacturing");
        manufacturer.launchProcess();

        manufacturer = new SmartphoneManufacturingProcess("Smartphone manufacturing");
        manufacturer.launchProcess();
    }
}
