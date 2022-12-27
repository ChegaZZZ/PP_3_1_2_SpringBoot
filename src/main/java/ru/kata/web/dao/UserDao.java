package ru.kata.web.dao;

import java.util.List;

import ru.kata.web.model.User;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}