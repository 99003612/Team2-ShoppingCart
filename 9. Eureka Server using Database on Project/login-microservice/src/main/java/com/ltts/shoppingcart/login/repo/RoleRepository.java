package com.ltts.shoppingcart.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.shoppingcart.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
