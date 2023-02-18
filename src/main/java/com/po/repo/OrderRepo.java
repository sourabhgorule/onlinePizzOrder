package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.po.model.Order;

public interface OrderRepo extends JpaRepository<Order,Long>{
    
}
