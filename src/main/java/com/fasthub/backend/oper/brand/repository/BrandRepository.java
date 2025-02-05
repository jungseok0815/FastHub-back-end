package com.fasthub.backend.oper.brand.repository;

import com.fasthub.backend.oper.brand.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    Optional<Brand> findById(Long id);
}
