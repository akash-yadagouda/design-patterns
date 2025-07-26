package com.example.observer.observer;

import com.example.observer.model.User;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationObserver implements NotificationObserver {
    @Override
    public void update(User user) {
        System.out.println("📱 Sending SMS to: " + user.getPhone());
    }
}