package com.masai.Question1;

public class PaymentFactory {
    Payment payment;

    public PaymentFactory(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.payBill();
    }
}
