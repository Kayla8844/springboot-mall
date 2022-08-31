package com.kayla.springbootmall.service.impl;

import com.kayla.springbootmall.dao.UserDao;
import com.kayla.springbootmall.dto.UserRegisterRequest;
import com.kayla.springbootmall.model.User;
import com.kayla.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
