package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.PesananItem;

public interface PesananItemRepository extends JpaRepository<PesananItem, String>{
    
}
