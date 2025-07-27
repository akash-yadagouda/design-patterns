package com.example.payment;

import com.example.payment.factory.PaymentGateway;
import com.example.payment.factory.PaymentGatewayFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    private final PaymentGatewayFactory factory;

    public PaymentController(PaymentGatewayFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    public String pay(@RequestParam String method, @RequestParam double amount) {
        PaymentGateway gateway = factory.getPaymentGateway(method);
        return gateway.pay(amount);
    }
}
