package com.example.payment.factory;

import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayFactory {

    public PaymentGateway getPaymentGateway(String type) {
        switch (type.toLowerCase()) {
            case "upi":
                return new UpiPaymentGateway();
            case "card":
                return new CardPaymentGateway();
            case "cash":
                return new CashPaymentGateway();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
