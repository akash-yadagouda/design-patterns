package com.example.observer.subject;

import com.example.observer.model.User;
import com.example.observer.observer.NotificationObserver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRegistrationSubject {
    private final List<NotificationObserver> observers = new ArrayList<>();

    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(User user) {
        for (NotificationObserver observer : observers) {
            observer.update(user);
        }
    }
}