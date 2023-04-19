package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.PesananLog;

public interface PesananRepository extends JpaRepository<PesananLog, String>{
    
}
