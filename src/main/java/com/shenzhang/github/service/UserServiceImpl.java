package com.shenzhang.github.service;

import com.shenzhang.github.model.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static com.google.common.collect.Lists.newArrayList;

/**
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 12:59 AM
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> listAllUsers() {
        List<User> users = newArrayList();
        users.add(randomUser());
        return users;
    }

    @Override
    public User randomUser() {
        User user = new User();
        user.setId(new Date().getTime());
        user.setName(UUID.randomUUID().toString());
        return user;
    }
}
