package com.example.observer.observer;

import com.example.observer.model.User;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationObserver implements NotificationObserver {
    @Override
    public void update(User user) {
        System.out.println("📧 Sending Email to: " + user.getEmail());
    }
}