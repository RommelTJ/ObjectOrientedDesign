package com.rommelrico;

/**
 * Created by Rommel on 5/1/2016.
 */
public class AccountsReceivable {
    private Accounting accounting;

    public AccountsReceivable(Accounting accounting) {
        accounting = accounting;
    }

    public void postPayment() {
        accounting.chargeCustomer();
    }

    public void sendInvoice() {
        accounting.prepareInvoice();
    }
}
