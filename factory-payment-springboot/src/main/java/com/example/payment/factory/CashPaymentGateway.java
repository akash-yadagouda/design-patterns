package com.example.payment.factory;

public class CashPaymentGateway implements PaymentGateway {
    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " in Cash.";
    }
}
