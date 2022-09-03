package com.cydeo;

import com.cydeo.balance.Balance;
import com.cydeo.category.Category;

import java.util.ArrayList;
import java.util.List;

public class StaticConstants {

    public static final List<Customer>CUSTOMER_LIST=new ArrayList<>();
    public static final List<Category>CATEGORY_LIST=new ArrayList<>();
    public static final List<Product>PRODUCT_LIST=new ArrayList<>();
    public static final List<Balance>COSTUMER_BALANCE_LIST=new ArrayList<>();
    public static final List<Balance>GIFT_CARD_BALANCE_LIST=new ArrayList<>();
    public static final List<Discount>DISCOUNT_LIST=new StaticConstants();
    public static final List<Order>ORDER_LIST=new StaticConstants();

}
