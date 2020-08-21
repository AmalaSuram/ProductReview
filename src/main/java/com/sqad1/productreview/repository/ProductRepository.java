package com.sqad1.productreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sqad1.productreview.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
