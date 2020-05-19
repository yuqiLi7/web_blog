package com.whu.service;

import com.whu.po.User;

/**
 * Created by yuqi Li.
 */
public interface UserService {

    User checkUser(String username, String password);
}
