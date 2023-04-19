package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String>{
    
}
