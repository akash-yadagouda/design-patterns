package com.example.observer.observer;

import com.example.observer.model.User;

public interface NotificationObserver {
    void update(User user);
}