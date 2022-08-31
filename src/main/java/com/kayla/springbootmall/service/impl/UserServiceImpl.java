package com.kayla.springbootmall.service.impl;

import com.kayla.springbootmall.dao.UserDao;
import com.kayla.springbootmall.dto.UserRegisterRequest;
import com.kayla.springbootmall.model.User;
import com.kayla.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        // 檢查註冊的 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user != null) {
            // {} 是 userRegisterRequest.getEmail()
            log.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());

            // 可有多個 {}，後面參數對應個數
//            log.warn("該 email {} 已經被 {} 註冊", userRegisterRequest.getEmail(), "Kayla");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        // 創建帳號
        return userDao.createUser(userRegisterRequest);
    }
}
