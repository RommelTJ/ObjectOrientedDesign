package com.rommelrico.formatter;

import com.rommelrico.models.Employee;

/**
 * Created by Rommel on 4/24/2016.
 */
public class EmployeeReportFormatter extends ReportFormatter {
    private Employee anEmployee;
    private FormatType formatType;

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
