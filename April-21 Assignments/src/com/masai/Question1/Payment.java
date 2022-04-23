package com.masai.Question1;

public interface Payment {
    public String payBill();
}

class CreditCard implements Payment {

    @Override
    public String payBill() {
        return null;
    }
}

class Check implements Payment {

    @Override
    public String payBill() {
        return null;
    }
}

class Cash implements Payment {

    @Override
    public String payBill() {
        return null;
    }
}