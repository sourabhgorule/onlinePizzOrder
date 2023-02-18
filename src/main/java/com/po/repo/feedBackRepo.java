package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.po.model.FeedBack;

public interface feedBackRepo  extends JpaRepository<FeedBack,Long>{
    
}
