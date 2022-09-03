package com.cydeo.balance;

import java.util.UUID;

public class CustomerBalance extends Balance{

    public CustomerBalance(UUID costumerId, Double balance) {
        super(costumerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance() + additionalBalance);
        return getBalance();
    }
}
