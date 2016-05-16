package com.rommelrico.subjects;

import com.rommelrico.domain.Employee;
import com.rommelrico.domain.EmployeeDAO;
import com.rommelrico.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rommelrico on 5/4/16.
 */
public class EmployeeManagementSystem implements ISubject {
    private List<IObserver> observerList;
    private List<Employee> employeeList;
    private EmployeeDAO employeeDAO;
    private Employee employee;
    private String msg;

    public EmployeeManagementSystem() {
        observerList = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employeeList = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver departments : observerList) {
            departments.callMe(msg, employee);
        }
    }

    public void hireNewEmployee(Employee employee) {
        this.employee = employee;
        msg = "New Hire: ";
        employeeList.add(employee);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == id) {
                String oldName = employee.getName();
                employee.setName(newName);
                this.employee = employee;
                this.msg = "Employee name has been modified from " + oldName +" to ";
                notify = true;
            }
        }

        if(notify) {
            notifyObservers();
        } else {
            System.out.println("Employee does not exist");
        }
    }

//    public void notifyAllDepartments()  {
//        for (IObserver department : observerList) {
//            department.callMe();
//        }
//    }
//
//    public static List<IObserver> getObserverList() {
//        return observerList;
//    }
//
//    public static void setObserverList(List<IObserver> observerList) {
//        EmployeeManagementSystem.observerList = observerList;
//    }
//
//    public static void main(String[] args) {
//        IObserver observer1 = new observers.HRDepartment();
//        IObserver observer2 = new observers.PayrollDepartment();
//        EmployeeManagementSystem.observerList = new List<IObserver>();
//    }
//
//    public void registerObserver(IObserver payroll) {
//    }

//    @Override
//    public void removeObserver(IObserver o) {
//
//    }
//
//    @Override
//    public void notifyObservers() {
//
//    }
//
}
