package com.example31._SpringBoot.service;

import com.example31._SpringBoot.dao.UserDAO;
import com.example31._SpringBoot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Transactional
    @Override
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(User userUp) {
        userDAO.updateUser(userUp);
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }


}
