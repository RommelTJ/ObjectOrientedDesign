package com.rommelrico.processes;

/**
 * Created by Rommel on 5/1/2016.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    public void assembleDevice() {
        System.out.println("Assembling Laptop");
    }

    @Override
    public void testDevice() {
        System.out.println("Testing Laptop");
    }

    @Override
    public void packageDevice() {
        System.out.println("Packaging Laptop");
    }

    @Override
    public void storeDevice() {
        System.out.println("Storing Laptop");
    }
}
