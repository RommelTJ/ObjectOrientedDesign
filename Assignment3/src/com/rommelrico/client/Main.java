package com.rommelrico.client;

import com.rommelrico.models.Employee;

public class Main {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        ClientModule.printEmployeeReport(peggy);
    }
}
