package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.po.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long>{
    
}
