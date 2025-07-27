package com.example.payment.factory;

public class CardPaymentGateway implements PaymentGateway {
    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " using Credit/Debit Card.";
    }
}
