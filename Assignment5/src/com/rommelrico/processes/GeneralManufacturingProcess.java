package com.rommelrico.processes;

/**
 * Created by Rommel on 5/1/2016.
 */
public abstract class GeneralManufacturingProcess {
    String processName;

    public GeneralManufacturingProcess(String name) {
        this.processName = name;
    }

    public void launchProcess() {
        assembleDevice();
        testDevice();
        packageDevice();
        storeDevice();
    }

    abstract protected void assembleDevice();
    abstract protected void testDevice();
    abstract protected void packageDevice();
    abstract protected void storeDevice();
}
