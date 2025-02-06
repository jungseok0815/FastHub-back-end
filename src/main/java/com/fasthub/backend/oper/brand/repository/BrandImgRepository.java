package com.fasthub.backend.oper.brand.repository;

import com.fasthub.backend.oper.brand.entity.Brand;
import com.fasthub.backend.oper.brand.entity.BrandImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandImgRepository extends JpaRepository<BrandImg, Long> {
    void deleteByBrand(Brand brand);
    Optional<BrandImg> findByBrand(Brand brand);
}
