package com.cydeo.checkout;

import com.cydeo.Customer;

public class MixPaymentCheckoutServiceImpl implements CheckoutService{
    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        return false;
    }
}
