package com.whu.service;

import com.whu.dao.UserRepository;
import com.whu.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuqi Li.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
//        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        User user = userRepository.findByUsernameAndPassword(username, password);
        System.out.println("user = " + user);
        return user;
    }
}
