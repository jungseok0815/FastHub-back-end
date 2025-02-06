package com.fasthub.backend.oper.brand.repository;

import com.fasthub.backend.oper.brand.entity.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    Optional<Brand> findById(Long id);


    @Query("SELECT b FROM Brand b WHERE :ketword IS NULL OR :keyword = '' OR b.brandNm LIKE %:keyword")
    Page<Brand> findAllByKeyword(@Param("keyword") String keyword, Pageable pageable);
}
