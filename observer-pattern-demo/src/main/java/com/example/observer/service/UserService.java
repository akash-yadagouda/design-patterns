package com.example.observer.service;

import com.example.observer.model.User;
import com.example.observer.observer.EmailNotificationObserver;
import com.example.observer.observer.SMSNotificationObserver;
import com.example.observer.subject.UserRegistrationSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRegistrationSubject subject;

    @Autowired
    private EmailNotificationObserver emailObserver;

    @Autowired
    private SMSNotificationObserver smsObserver;

    public void registerUser(User user) {
        subject.registerObserver(emailObserver);
        subject.registerObserver(smsObserver);
        System.out.println("✅ User Registered: " + user.getName());
        subject.notifyObservers(user);
    }
}