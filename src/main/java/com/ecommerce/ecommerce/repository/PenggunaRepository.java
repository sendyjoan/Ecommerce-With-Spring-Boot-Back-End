package com.ecommerce.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

    Boolean existsByEmail(String email);
    
}
