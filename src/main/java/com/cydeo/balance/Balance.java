package com.cydeo.balance;

import java.util.UUID;

public abstract class Balance {

    private UUID costumerId;
    private Double balance;

    public Balance(UUID costumerId, Double balance) {
        this.costumerId = costumerId;
        this.balance = balance;
    }
    public abstract Double addBalance(Double additionalBalance);

    public UUID getCostumerId() {
        return costumerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

