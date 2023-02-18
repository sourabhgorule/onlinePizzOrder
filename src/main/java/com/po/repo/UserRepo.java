package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.po.model.User;

public interface UserRepo extends JpaRepository<User,Long>{
    
}
