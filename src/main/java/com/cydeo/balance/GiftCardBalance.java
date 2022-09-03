package com.cydeo.balance;

import java.util.UUID;

public class GiftCardBalance extends Balance{


    public GiftCardBalance(UUID costumerId, Double balance) {
        super(costumerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionAmount = additionalBalance * 10/100;
        setBalance(getBalance() + additionalBalance + promotionAmount);
        return getBalance();
    }
}
