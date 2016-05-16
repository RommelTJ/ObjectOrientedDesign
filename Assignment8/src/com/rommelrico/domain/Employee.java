package com.rommelrico.domain;

import java.util.Date;

/**
 * Created by rommelrico on 5/4/16.
 */
public class Employee {
    private String name;
    private Date hireDate;
    private double salary;
    private boolean fired;
    public int employeeID;

    private static int COUNTER;

    public Employee(String name, Date hireDate, double salary, Boolean fired) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.fired = fired;

        this.employeeID = ++COUNTER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Employee.COUNTER = COUNTER;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", fired=" + fired +
                ", employeeID=" + employeeID +
                '}';
    }
}
