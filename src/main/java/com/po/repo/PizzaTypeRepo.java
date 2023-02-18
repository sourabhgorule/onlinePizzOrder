package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.po.model.Pizzatype;

@Repository
public interface PizzaTypeRepo extends JpaRepository<Pizzatype,Long>{
    
}
