package com.rommelrico.database;

import com.rommelrico.database.DatabaseConnectionManager;
import com.rommelrico.models.Employee;

/**
 * Created by Rommel on 4/24/2016.
 */
public class EmployeeDAO {
    private DatabaseConnectionManager connectionManager;

    public DatabaseConnectionManager getConnectionManager() {
        return connectionManager;
    }

    public void setConnectionManager(DatabaseConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public void saveEmployee(Employee employee) {
//        try {
//            com.rommelrico.database.DatabaseConnectionManager connectionManager = com.rommelrico.database.DatabaseConnectionManager.getManagerInstance();
//            connectionManager.connect();
//            connectionManager.getConnectionObject().prepareStatement("insert into com.rommelrico.employee.Employee tbl");
//            connectionManager.disconnect();
//        } catch (SQLException e) {
//            System.out.println("Exception: " + e);
//        }
        System.out.println("Saved employee: "+employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleting employee");
    }

}
