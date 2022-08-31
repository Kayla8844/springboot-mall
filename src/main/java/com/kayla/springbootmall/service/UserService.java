package com.kayla.springbootmall.service;

import com.kayla.springbootmall.dto.UserRegisterRequest;
import com.kayla.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
