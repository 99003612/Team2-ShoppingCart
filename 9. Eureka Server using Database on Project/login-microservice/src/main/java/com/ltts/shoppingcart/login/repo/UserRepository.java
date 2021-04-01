package com.ltts.shoppingcart.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.shoppingcart.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
