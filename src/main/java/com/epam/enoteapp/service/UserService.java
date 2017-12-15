package com.epam.enoteapp.service;

import com.epam.enoteapp.domain.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    User getUser(Long id);

    User updateUser(User user);

    void deleteUserById(Long id);

    List<User> getAll();
}
