package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.po.model.Pizzatype;

public interface PizzaTypeRepo extends JpaRepository<Pizzatype,Long>{
    
}
