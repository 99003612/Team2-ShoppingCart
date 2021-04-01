package com.ltts.shoppingcart.login.service;

import com.ltts.shoppingcart.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
