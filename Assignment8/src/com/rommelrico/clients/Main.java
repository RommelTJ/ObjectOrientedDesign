package com.rommelrico.clients;

import com.rommelrico.domain.Employee;
import com.rommelrico.observers.HRDepartment;
import com.rommelrico.observers.IObserver;
import com.rommelrico.observers.PayrollDepartment;
import com.rommelrico.subjects.EmployeeManagementSystem;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(6, "Rommel");
    }
}
