package com.whu.dao;

import com.whu.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yuqi Li.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
