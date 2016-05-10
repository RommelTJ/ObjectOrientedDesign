package com.rommelrico.client;

import com.rommelrico.database.EmployeeDAO;
import com.rommelrico.formatter.EmployeeReportFormatter;
import com.rommelrico.formatter.FormatType;
import com.rommelrico.models.Employee;

/**
 * Created by Rommel on 4/24/2016.
 */
public class ClientModule {
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee) {
        EmployeeReportFormatter reportFormatter = new EmployeeReportFormatter(employee, FormatType.XML);
        System.out.println(reportFormatter.getFormattedEmployee());
    }
}
