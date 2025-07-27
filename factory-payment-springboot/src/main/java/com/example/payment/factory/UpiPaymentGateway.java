package com.example.payment.factory;

public class UpiPaymentGateway implements PaymentGateway {
    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " using UPI.";
    }
}
