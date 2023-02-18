package com.po.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.po.model.FeedBack;

@Repository
public interface feedBackRepo  extends JpaRepository<FeedBack,Long>{
    
}
