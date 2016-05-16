package com.rommelrico.observers;

import com.rommelrico.domain.Employee;

/**
 * Created by rommelrico on 5/4/16.
 */
public class HRDepartment implements IObserver {
    @Override
    public void callMe(String msg, Employee employee) {
        System.out.println("Called HR Department");
        System.out.println(msg + " " + employee.getName());
    }
}
