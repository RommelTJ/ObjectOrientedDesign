package com.rommelrico;

import java.util.Date;
import java.util.List;

/**
 * Created by Rommel on 5/1/2016.
 */
public class CustomerTransaction implements Accounting, Reporting {
    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    //Methods for reporting
    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakdown() {
        String report = "";
        for (Product product: products) {
            report += product.getName();
        }
        return report;
    }

    //Methods for account receivable
    @Override
    public void prepareInvoice() {
        System.out.println("Preparing Invoice");
    }
    @Override
    public void chargeCustomer() {
        System.out.println("Charging customer");
    }
}
