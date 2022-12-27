package ru.kata.web.service;

import java.util.List;

import ru.kata.web.model.User;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}