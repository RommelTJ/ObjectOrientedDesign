package com.rommelrico.formatter;

/**
 * Created by Rommel on 4/24/2016.
 */
public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch(formatType) {
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        //System.out.println("Converting object to XML");
        return "<title>"+object.toString()+"</title>";
    }
    private String convertObjectToCSV(Object object) {
        //System.out.println("Converting object to String");
        return object.toString()+",";
    }
    public String getFormattedValue() {
        return formattedOutput;
    }
}
