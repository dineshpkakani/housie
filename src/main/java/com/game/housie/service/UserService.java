package com.game.housie.service;


import com.game.housie.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
