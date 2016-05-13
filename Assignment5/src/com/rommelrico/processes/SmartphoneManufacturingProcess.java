package com.rommelrico.processes;

/**
 * Created by Rommel on 5/1/2016.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    public void assembleDevice() {
        System.out.println("Assembling Smartphone");
    }

    @Override
    public void testDevice() {
        System.out.println("Testing Smartphone");
    }

    @Override
    public void packageDevice() {
        System.out.println("Packaging Smartphone");
    }

    @Override
    public void storeDevice() {
        System.out.println("Storing Smartphone");
    }
}
