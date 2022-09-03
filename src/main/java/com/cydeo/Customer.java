package com.cydeo;

import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;
    private String UserName;
    private String email;
    private List<Address> address;

    public Customer(UUID id, String userName, String email) {
        this.id = id;
        UserName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        UserName = userName;
        this.email = email;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }
}
