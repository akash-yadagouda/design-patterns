# Payment Gateway - Factory Design Pattern

This Spring Boot project demonstrates the **Factory Design Pattern** using a real-world use case: selecting a payment method dynamically.

## Features
- UPI, Card, and Cash payment options
- Factory creates appropriate implementation based on the input

## Endpoint Example
`POST /pay?method=upi&amount=500` → Paid ₹500 using UPI.
