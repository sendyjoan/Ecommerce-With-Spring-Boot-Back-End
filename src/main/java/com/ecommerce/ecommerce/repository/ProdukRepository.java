package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String>{
    
}
