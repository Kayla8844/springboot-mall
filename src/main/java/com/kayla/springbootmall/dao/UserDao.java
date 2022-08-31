package com.kayla.springbootmall.dao;

import com.kayla.springbootmall.dto.UserRegisterRequest;
import com.kayla.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
