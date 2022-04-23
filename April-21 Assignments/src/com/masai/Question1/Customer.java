package com.masai.Question1;

import java.time.DateTimeException;
import java.util.Date;

public class Customer {
    String name;
    Address address;
    Date check_in;
    Date check_out;

    public Customer(String name, Address address, Date check_in, Date check_out) {
        this.name = name;
        this.address = address;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }
}
