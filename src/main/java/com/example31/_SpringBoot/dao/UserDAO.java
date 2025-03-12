package com.example31._SpringBoot.dao;


import com.example31._SpringBoot.entity.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    List<User> listUsers();
    void deleteUserById(long id);
    void updateUser(User userUp);
    User getUserById(long id);
}
