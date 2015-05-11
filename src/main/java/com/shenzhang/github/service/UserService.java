package com.shenzhang.github.service;

import com.shenzhang.github.model.User;

import java.util.List;

/**
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 12:59 AM
 */
public interface UserService {
    List<User> listAllUsers();

    User randomUser();
}
