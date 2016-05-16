package com.rommelrico.domain;

import com.rommelrico.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rommelrico on 5/4/16.
 */
public class EmployeeDAO {
    List<Employee> employeeList;

    Employee emp1 = new Employee("Mike", null, 5000, false);
    Employee emp2 = new Employee("Steve", null, 4500, false);
    Employee emp3 = new Employee("John", null, 7000, false);
    Employee emp4 = new Employee("Pat", null, 6000, false);
    Employee emp5 = new Employee("Joe", null, 8000, false);

    public List<Employee> generateEmployees() {
        employeeList = new ArrayList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        return employeeList;
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
}
