package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Keranjang;

public interface KeranjangRepository extends JpaRepository<Keranjang, String>{
    
}
