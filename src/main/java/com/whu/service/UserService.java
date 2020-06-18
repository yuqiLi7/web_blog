package com.whu.service;

import com.whu.entity.User;


public interface UserService {

    User checkUser(String username, String password);
}
